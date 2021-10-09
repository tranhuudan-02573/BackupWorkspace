import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(body: Home()),
      theme: ThemeData(
        primaryColor: Colors.blue,
        dividerTheme: DividerThemeData(
          color: Colors.purple,
          thickness: 10,
          space: 50,
          indent: 20,
          endIndent: 20,
        ),
      ),
    );
  }
}

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Center(
      child: SizedBox(
        width: 200,
        child: Column(
          children: <Widget>[
            Spacer(),
            Container(
              height: 200,
              width: 200,
              color: Colors.blue,
            ),
            const Divider(),
            const Divider(),
            const Divider(),
            const Divider(),
            const Divider(),
            const Divider(),
            Container(
              height: 200,
              width: 200,
              color: Colors.red,
            ),
            Spacer(),
          ],
        ),
      ),
    );
  }
}
