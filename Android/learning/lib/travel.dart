import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() {
    return _MyHomePageState();
  }
}

class _MyHomePageState extends State<MyHomePage> {
  final counterKey = GlobalKey<CounterState>();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(
          title: Text(
              'Thậm chí đưa data lên tới tận đây: ${counterKey.currentState?.counter ?? 0}'),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Text(
                  'Miễn có GlobalKey là chỗ nào cũng có thể truy cập: ${counterKey.currentState?.counter ?? 0}'),
              Counter(key: counterKey),
              FlatButton(
                child: Text('Qua màn khác'),
                color: Colors.pink,
                onPressed: () {
                  Navigator.of(context).push(MaterialPageRoute(
                      builder: (ctx) => SecondPage(counterKey: counterKey)));
                },
              )
            ],
          ),
        ),
        floatingActionButton: FloatingActionButton(
          child: Icon(Icons.add),
          onPressed: () {
            setState(() {
              counterKey.currentState.incrementCounter();
            });
          },
        ),
      ),
    );
  }
}

// Widget Counter nắm giữ biến counter và có 1 GlobalKey được gán vào Widget này
class Counter extends StatefulWidget {
  const Counter({Key key}) : super(key: key);

  @override
  CounterState createState() => CounterState();
}

class CounterState extends State<Counter> {
  int counter = 0;

  void incrementCounter() {
    counter++;
  }

  @override
  Widget build(BuildContext context) {
    return Text('$counter', style: Theme.of(context).textTheme.headline4);
  }
}

// màn hình thứ 2
class SecondPage extends StatefulWidget {
  SecondPage({this.counterKey});

  final GlobalKey<CounterState> counterKey;

  @override
  State<StatefulWidget> createState() {
    return SecondPageState();
  }
}

class SecondPageState extends State<SecondPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
                'Du lịch qua màn hình mới: ${widget.counterKey.currentState?.counter ?? 0}',
                style: Theme.of(context).textTheme.headline5),
            FlatButton(
              child: Text('Về lại màn cũ'),
              color: Colors.orange,
              onPressed: () {
                Navigator.pop(context);
              },
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
          child: Icon(Icons.add),
          onPressed: () {
            setState(() {
              widget.counterKey.currentState.incrementCounter();
            });
          }),
    );
  }
}
