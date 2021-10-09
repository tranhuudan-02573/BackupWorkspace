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

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  User user = User();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            children: [
              Form(
                child: Builder(
                  builder: (BuildContext ctx) => Column(
                    children: [
                      TextFormField(
                        decoration: InputDecoration(
                          hintText: 'Vui lòng nhập tên',
                          labelText: 'Tên',
                        ),
                        validator: validateTen,
                        onSaved: saveTen,
                      ),
                      TextFormField(
                        decoration: InputDecoration(
                          hintText: 'Vui lòng nhập đúng tuổi',
                          labelText: 'Tuổi',
                        ),
                        validator: validateTuoi,
                        onSaved: saveTuoi,
                      ),
                      FlatButton(
                        // FlatButton được di chuyển vào làm child của Form
                        child: Text('Submit'),
                        color: Colors.pink,
                        onPressed: () => submitForm(
                            ctx), // hàm submitForm truyền context vào
                      )
                    ],
                  ),
                ),
              )
            ],
          ),
        ),
      ),
    );
  }

  String validateTen(String inputName) {
    if (inputName.isEmpty) {
      return 'Tên không được trống';
    } else {
      return null;
    }
  }

  String validateTuoi(String inputAge) {
    try {
      if (int.tryParse(inputAge) < 18) {
        return 'Phim cấm trẻ em dưới 18 tuổi';
      } else {
        return null;
      }
    } catch (e) {
      return 'Bạn nhập kiểu gì để nó lỗi vậy. Nhớ nhập số nha';
    }
  }

  void saveTen(String inputName) {
    user.name = inputName;
  }

  void saveTuoi(String inputAge) {
    user.age = int.tryParse(inputAge);
  }

  void submitForm(BuildContext context) {
    if (Form.of(context).validate()) {
      // sử dụng Form.of(context) để get được FormState gần vị trí context nhất
      print('Trước khi save: Tên: ${user.name} và tuổi: ${user.age}');
      Form.of(context)
          .save(); // sử dụng Form.of(context) để get được FormState gần vị trí context nhất
      print('Sau khi save: Tên: ${user.name} và tuổi: ${user.age}');
    } else {
      print('Validate thất bại. Vui lòng thử lại');
    }
  }
}

class User {
  User({this.name, this.age});

  String name;
  int age;
}
