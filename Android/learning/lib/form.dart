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
  final formStateKey = GlobalKey<FormState>(); // tạo GlobalKey cho form
  User user = User(); // tạo object User

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            children: [
              Form(
                key: formStateKey, // gán key cho Form
                child: Column(
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
                  ],
                ),
              ),
              SizedBox(height: 20),
              // sử dụng SizedBox để tạo một khoảng space giữa Button và Form
              FlatButton(
                child: Text('Submit'),
                color: Colors.pink,
                onPressed: submitForm,
              ),
            ],
          ),
        ),
      ),
    );
  }

  String validateTen(String inputName) {
    if (inputName.isEmpty) {
      // String khác null, đồng nghĩa với validate lỗi, đây cũng chính là nội dung lỗi
      return 'Tên không được trống';
    } else {
      // String trả về là null, đồng nghĩa với validate thành công
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
    user.name = inputName; // lưu tên vào biến user
  }

  void saveTuoi(String inputAge) {
    user.age = int.tryParse(inputAge); // lưu tuổi vào biến user
  }

  void submitForm() {
    // Khi form gọi hàm validate thì tất cả các TextFormField sẽ gọi hàm validate.
    // Đó là sức mạnh và lý do cần sử dụng widget Form
    if (formStateKey.currentState.validate()) {
      // hàm validate trả về true là thành công, false là thất bại
      print('Trước khi save: Tên: ${user.name} và tuổi: ${user.age}');
      formStateKey.currentState
          .save(); // khi form gọi hàm save thì tất cả các TextFormField sẽ gọi hàm save
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
