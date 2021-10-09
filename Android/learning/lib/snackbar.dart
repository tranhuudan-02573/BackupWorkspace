import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: MyHomePage(),
        theme: ThemeData(
          primaryColor: Colors.pink, // sử dụng màu hồng thay cho màu xanh blue
        ));
  }
}

class MyHomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: MyFlatButton(),
      ),
    );
  }
}

class MyFlatButton extends StatelessWidget {
  const MyFlatButton({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return FlatButton(
      child: Text('show snackbar'),
      color: Colors.pink,
      onPressed: () {
        // xử lý show snackbar khi click
        final snackBar = SnackBar(
            content: Text(
                'Không thể truy cập bài viết này vì thấy hay mà không vote'));
        Scaffold.of(context).showSnackBar(snackBar);
      },
    );
  }
}
