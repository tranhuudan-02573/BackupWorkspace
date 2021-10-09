import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  final scaffoldKey = GlobalKey<ScaffoldState>(); // <=== dòng này

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      key: scaffoldKey, // <=== dòng này
      body: Center(
        child: FlatButton(
          child: Text('show snackbar'),
          color: Colors.pink,
          onPressed: () {
            final snackBar = SnackBar(
                content: Text(
                    'Không thể truy cập bài viết này vì thấy hay mà không vote'));
            scaffoldKey.currentState.showSnackBar(snackBar); // <=== dòng này
          },
        ),
      ),
    );
  }
}
