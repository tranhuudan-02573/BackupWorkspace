import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: MyHomePage(myChild: MyCenterWidget()),
        theme: ThemeData(
          primaryColor:
              Colors.purpleAccent, // sử dụng màu hồng thay cho màu xanh blue
        ));
  }
}

// Đây là một StatefulWidget
class MyHomePage extends StatefulWidget {
  MyHomePage({this.myChild}); // thêm dòng này

  final Widget myChild; // thêm dòng này
  @override
  MyHomePageState createState() => MyHomePageState();
}

// Đây là một StatefulWidget
class MyHomePageState extends State<MyHomePage> {
  int counter = 0;

  @override
  Widget build(BuildContext context) {
    print('1. hàm build được gọi do hàm setState được gọi'); // đặt log thứ 1
    return Scaffold(
      appBar: AppBar(
        title: Text('demo inheritedwidget'),
        backgroundColor: Theme.of(context).primaryColor,
      ),
      // khởi tạo MyInheritedWidget tại vị trí cha của cả MyCenterWidget và MyText
      body: MyInheritedWidget(
        myData: counter,
        child: widget
            .myChild, // sửa lại dòng code này, sử dụng `widget.child` thay vì tạo mới `MyCenterWidget()`
        // `widget` chính reference của MyHomePage widget ấy. (*)
        // vì vậy widget.myChild tương đương với subtree của MyHomePage, chính là từ MyCenterWidget đến hết cây
        // child: MyCenterWidget(), // child là sub tree từ MyCenterWidget xuống
        // myData:
        //     counter, // data cần chia sẻ cho mấy widget child chính là counter
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          setState(() {
            counter++;
          });
        },
        backgroundColor: Theme.of(context).primaryColor,
        child: Icon(Icons.add),
      ),
    );
  }
}

class MyInheritedWidget extends InheritedWidget {
  // 1
  const MyInheritedWidget({Widget child, this.myData}) : super(child: child);

  // 2
  final int myData;

  // 3
  @override
  bool updateShouldNotify(MyInheritedWidget oldWidget) {
    return myData !=
        oldWidget
            .myData; // nếu data thay đổi thì return true để rebuild các widget con phụ thuộc
    // return myData % 2 == 1;
  }

  // 4
  static MyInheritedWidget of(BuildContext context) {
    // 5
    return context.dependOnInheritedWidgetOfExactType<MyInheritedWidget>();
  }
}

// thoải mái xóa hết constructor và data trong MyCenterWidget
class MyCenterWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    print('2. log build MyCenterWidget'); // đặt log thứ 2
    return Center(
      child: MyText(),
    );
  }
}

// thậm chí xóa luôn constructor và data khai báo trong MyText
class MyText extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // Nhờ hàm MyInheritedWidget.of ta sẽ get được data
    // Bởi vì hàm of là hàm static nên ta có thể gọi ở bất cứ widget con nào ta muốn
    final counter = MyInheritedWidget.of(context).myData;
    print('3. log build MyText với counter = $counter'); // đặt log thứ 3
    // get được data thì update UI thôi :D
    return Text('Tui là widget Text. Data của tui hiện tại là: $counter');
  }
}
