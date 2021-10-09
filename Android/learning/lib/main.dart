import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
      home: SafeArea(
          child: Scaffold(
    appBar: AppBar(
      backgroundColor: Colors.pink,
      title: Text('Cua nàng Flutter'),
    ),
    body: buildColumn(),
  ))));
}

class buildColumn extends StatelessWidget {
  const buildColumn({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      // bố trí widget theo chiều dọc
      children: [
        // sử dụng children truyền vào 1 mảng widget
        Text('Hi bạn, cho mình làm quen nhé!'),
        Row(
          // bố trí 3 button theo chiều ngang
          children: [
            // sử dụng children truyền vào 1 mảng 3 phần tử widget FlatButton
            FlatButton(
              child: Text('red'),
              color: Colors.red,
              onPressed:
                  () {}, // tạm thời khi click vào button sẽ chưa có tác dụng gì
            ),
            FlatButton(
              child: Text('yellow'),
              color: Colors.yellow,
              onPressed: () {},
            ),
            FlatButton(
              child: Text('green'),
              color: Colors.green,
              onPressed: () {},
            )
          ],
        )
      ],
    );
  }
}
