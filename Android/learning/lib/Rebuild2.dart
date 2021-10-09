import 'dart:math';
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
  var listTile = <Widget>[
    Tile(key: GlobalKey<_TileState>()),
    Tile(key: GlobalKey<_TileState>())
  ];

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Column(
          // sửa lại trong Column
          children: [
            Row(
              children: [
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: listTile.first,
                ),
                Text('Tile thuộc Row')
              ],
            ),
            listTile[1]
          ],
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: swapTwoTileWidget,
          child: Icon(Icons.swap_horiz),
        ),
      ),
    );
  }

  void swapTwoTileWidget() {
    setState(() {
      listTile.insert(1, listTile.removeAt(0));
    });
  }
}

class Tile extends StatefulWidget {
  Tile({Key key}) : super(key: key);

  @override
  _TileState createState() {
    return _TileState();
  }
}

class _TileState extends State<Tile> {
  final Color color = generateRandomColor();

  @override
  Widget build(BuildContext context) {
    return Container(
      // thêm 2 widget Center, Text vào Container
      color: color,
      width: 100,
      height: 100,
      child:
          Center(child: Text('(${color.red}, ${color.green}, ${color.blue})')),
    );
  }
}

Color generateRandomColor() {
  final Random random = Random();
  return Color.fromRGBO(
      random.nextInt(255), random.nextInt(255), random.nextInt(255), 1);
}
