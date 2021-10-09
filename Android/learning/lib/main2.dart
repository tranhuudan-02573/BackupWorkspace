import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: MyHomePage(),
        theme: ThemeData(
          primaryColor: Colors.purpleAccent, // sử dụng màu hồng thay cho màu xanh blue
        ));
  }
}

// Đây là một StatefulWidget
class MyHomePage extends StatefulWidget {

  @override
  MyHomePageState createState() => MyHomePageState();
}

// Đây là class State của StatefulWidget MyHomePage
class MyHomePageState extends State<MyHomePage> {
  int counter = 0; // Data của Widget

  @override
  Widget build(BuildContext context) {
    // hàm build
    return Scaffold(

      appBar: AppBar(
        title: Text('demo flutter'),
        backgroundColor: Theme.of(context).primaryColor,
      ),
      body: Center(
          // data là biến counter được truyền vào hàm build - công thức UI = build(Data)
          child: MyText(counter: counter)),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          // khi click button màu xanh blue
          setState(() {
            // ta sẽ gọi hàm setState
            counter++; // để gán lại giá trị mới cho biến counter
            // bên trong hàm setState này sẽ tự động gọi lại hàm build nên UI được update (rebuild)
          });
        },
        backgroundColor: Theme.of(context).primaryColor,
        child: Icon(Icons.add),
      ),
    );
  }
}

class MyText extends StatelessWidget {
  const MyText({
    Key key,
    @required this.counter,
  }) : super(key: key);

  final int counter;

  @override
  Widget build(BuildContext context) {
    return Text('Tui là widget Text. Data của tui hiện tại là: $counter');
  }
}
