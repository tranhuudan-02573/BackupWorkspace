import 'dart:async';
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
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  final bloc = MyBloc();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Column(
          children: [
            Row(
              children: [
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: StreamBuilder<MyState>(
                    stream: bloc.stateController.stream,
                    initialData: bloc.myState,
                    builder: (_, snapshot) {
                      return Tile(snapshot.data.listColor.first);
                    },
                  ),
                ),
                Text('Tile thuộc Row')
              ],
            ),
            StreamBuilder<MyState>(
              stream: bloc.stateController.stream,
              initialData: bloc.myState,
              builder: (_, snapshot) {
                return Tile(snapshot.data.listColor[1]);
              },
            )
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
    bloc.eventController.add(SwapEvent());
  }

  @override
  void dispose() {
    bloc.dispose();
    super.dispose();
  }
}

class Tile extends StatelessWidget {
  Tile(this.color);

  final Color color;

  @override
  Widget build(BuildContext context) {
    return Container(
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

abstract class MyEvent {}

class SwapEvent extends MyEvent {}

class MyState {
  MyState(this.listColor);

  List<Color> listColor;
}

class MyBloc {
  var myState = MyState([generateRandomColor(), generateRandomColor()]);

  final eventController = StreamController<MyEvent>();
  final stateController = StreamController<MyState>.broadcast();

  MyBloc() {
    eventController.stream.listen((event) {
      if (event is SwapEvent) {
        myState.listColor.insert(1, myState.listColor.removeAt(0));
        stateController.sink.add(MyState(myState.listColor));
      }
    });
  }

  void dispose() {
    eventController.close();
    stateController.close();
  }
}
