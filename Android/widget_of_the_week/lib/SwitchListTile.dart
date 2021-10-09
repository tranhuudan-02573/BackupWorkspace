import 'package:flutter/material.dart';
import 'dart:math' as math;

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
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  bool _darkMode = false;
  bool _italicsMode = false;
  bool _greenMode = false;
  bool _birdMode = false;
  bool _selectAll = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("SwitchListTile"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            SwitchListTile(
              title: Text(
                'Dark Mode',
                style: TextStyle(
                    fontStyle:
                        _italicsMode ? FontStyle.italic : FontStyle.normal),
              ),
              onChanged: (bool value) => setState(() => _darkMode = value),
              value: _darkMode,
              secondary:
                  Icon(_darkMode ? Icons.brightness_7 : Icons.brightness_5),
              activeColor:
                  _greenMode ? Colors.green : Theme.of(context).accentColor,
            ),
            SwitchListTile(
              title: Text(
                'Italics Mode',
                style: TextStyle(
                    fontStyle:
                        _italicsMode ? FontStyle.italic : FontStyle.normal),
              ),
              onChanged: (bool value) => setState(() => _italicsMode = value),
              value: _italicsMode,
              secondary: Icon(_darkMode
                  ? Icons.sentiment_very_dissatisfied
                  : Icons.sentiment_very_satisfied),
              activeColor:
                  _greenMode ? Colors.green : Theme.of(context).accentColor,
            ),
            SwitchListTile(
              title: Text(
                'Green Mode',
                style: TextStyle(
                    fontStyle:
                        _italicsMode ? FontStyle.italic : FontStyle.normal),
              ),
              onChanged: (bool value) => setState(() => _greenMode = value),
              value: _greenMode,
              secondary: Transform(
                transform: Matrix4.rotationY(_greenMode ? math.pi : 0),
                alignment: Alignment.center,
                child: Icon(Icons.invert_colors),
              ),
              activeColor:
                  _greenMode ? Colors.green : Theme.of(context).accentColor,
            ),
            SwitchListTile(
              title: Text(
                'Bird Mode',
                style: TextStyle(
                    fontStyle:
                        _italicsMode ? FontStyle.italic : FontStyle.normal),
              ),
              onChanged: (bool value) => setState(() => _birdMode = value),
              value: _birdMode,
              secondary: Text(
                "🐦",
                style: TextStyle(fontSize: 24.0),
              ),
              activeThumbImage: _birdMode
                  ? NetworkImage("https://flutter.dev/images/favicon.png")
                  : null,
              inactiveThumbImage: _birdMode
                  ? NetworkImage("https://flutter.dev/images/favicon.png")
                  : null,
            ),
            SizedBox(height: 50.0),
            SwitchListTile(
              title: Text("Select All"),
              onChanged: (bool value) => setState(() {
                _selectAll = value;
                _darkMode = value;
                _italicsMode = value;
                _greenMode = value;
                _birdMode = value;
              }),
              value: _selectAll,
            ),
          ],
        ),
      ),
    );
  }
}
