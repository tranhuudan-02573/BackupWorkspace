import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      debugShowCheckedModeBanner: false,
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: CustomScrollView(
        slivers: <Widget>[
          SliverAppBar(
            expandedHeight: 130.0,
            stretch: true,
            floating: true,
            onStretchTrigger: () {
              // Refresh the list, maybe?
              return;
            },
            flexibleSpace: FlexibleSpaceBar(
              background: Image.network(
                  'https://flutter.github.io/assets-for-api-docs/assets/widgets/owl-2.jpg',
                  fit: BoxFit.cover),
              title: Text('Hello again, SliverAppBar'),
              stretchModes: <StretchMode>[
                StretchMode.zoomBackground,
                StretchMode.blurBackground,
                StretchMode.fadeTitle,
              ],
            ),
          ),
          SliverList(
            delegate: SliverChildListDelegate(
              [
                ColorBox(color: Colors.red),
                ColorBox(color: Colors.purple),
                ColorBox(color: Colors.green),
                ColorBox(color: Colors.orange),
                ColorBox(color: Colors.yellow),
                ColorBox(color: Colors.deepPurple),
                ColorBox(color: Colors.teal),
                ColorBox(color: Colors.lightGreen),
                ColorBox(color: Colors.yellowAccent),
                ColorBox(color: Colors.pink),
                ColorBox(color: Colors.tealAccent),
                ColorBox(color: Colors.amber),
                ColorBox(color: Colors.cyan),
                ColorBox(color: Colors.lime),
                ColorBox(color: Colors.deepOrange),
              ],
            ),
          )
        ],
      ),
    );
  }
}

class ColorBox extends StatelessWidget {
  final Color color;

  const ColorBox({Key key, this.color}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 100.0,
      color: color,
    );
  }
}
