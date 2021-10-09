import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage>
    with SingleTickerProviderStateMixin {
  int _counter = 0;

  AnimationController _appearAnimation;

  bool _ignoringAfterUiChange = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('IgnorePointer demo'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'You have pushed the button this many times:',
            ),
            Text(
              '$_counter',
              style: TextStyle(fontSize: 32),
            ),
          ],
        ),
      ),
      floatingActionButton: IgnorePointer(
        // Ignore during the time we're animating.
        ignoring: _ignoringAfterUiChange,
        // Don't ignore semantics. The buttons are still there.
        ignoringSemantics: false,
        child: SizedBox(
          height: 70,
          child: Row(
            mainAxisAlignment: MainAxisAlignment.end,
            crossAxisAlignment: CrossAxisAlignment.end,
            children: <Widget>[
              Padding(
                padding: const EdgeInsets.all(10),
                child: IconButton(
                  onPressed: _incrementCounter,
                  tooltip: 'Increment',
                  icon: Icon(Icons.add),
                ),
              ),
              SizeTransition(
                axis: Axis.horizontal,
                axisAlignment: 1,
                sizeFactor: _appearAnimation
                    .drive(CurveTween(curve: Curves.easeOutCubic)),
                child: Padding(
                  padding: const EdgeInsets.all(10),
                  child: IconButton(
                    onPressed: _resetCounter,
                    tooltip: 'Reset',
                    icon: Icon(
                      Icons.delete,
                      color: _counter > 0 ? Colors.red : Colors.black,
                    ),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  @override
  void dispose() {
    _appearAnimation.dispose();
    super.dispose();
  }

  @override
  void initState() {
    super.initState();
    _appearAnimation = AnimationController(
      duration: const Duration(milliseconds: 300),
      vsync: this,
    );

    // When the animation finishes (either at the end or in the beginning),
    // stop ignoring user input.
    _appearAnimation.addStatusListener((status) {
      if (status == AnimationStatus.completed ||
          status == AnimationStatus.dismissed) {
        setState(() => _ignoringAfterUiChange = false);
      }
    });
  }

  void _incrementCounter() {
    setState(() {
      _counter++;
    });

    // When the counter reaches 10, show the reset button.
    if (_counter == 10) {
      _appearAnimation.forward();
      setState(() => _ignoringAfterUiChange = true);
    }
  }

  void _resetCounter() {
    if (_counter == 0) {
      // On the second tap of the reset button, hide it.
      _appearAnimation.reverse();
      setState(() => _ignoringAfterUiChange = true);
    }

    setState(() {
      _counter = 0;
    });
  }
}
