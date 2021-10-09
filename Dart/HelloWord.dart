main() {
  print("Hello World");
  // basic type
  //int;
  //double;
  //bool;
  //String;
  //khai báo biến có 4 cách:
  int myAge = 3; // cách này ko đc khuyến khích
  var myScore = 3.5; // khuyến khích dùng cách này
  final isMyDog = true;
  const connectionTimeout = 1000;
  // kiểu dữ liệu linh hoạt dynamic
  dynamic dynamicTypeVariables = 3; // kiểu int
  dynamicTypeVariables = true;
  // tương tự như var -.-
  // kiểu num là kiểu vừa số nguyên vừa số thực như dynamic
  // toán tử toán học
  5 + 2; // 7
  5 - 2; // 3
  5 * 2; // 10
  5 / 2; // 2.5
  5 ~/ 2; // 2
  // so sanhs
  3 is int;
  3 is! int;
  // logical
  // ép kiểu
  3 as int;
  // gán
  var a;
  a = 3;
  a++; // 4
  ++a; //5
  a--; //4
  --a; //3
  a /= 2; // 4.5
  a ~/= 2; // 2
  // for each
  for (var i in list) {
    print(i);
    // string template
    print('gia tri cua a la $a  kieu cua a la ${a.runtimeType}');
  }
  var x;
  print(x ?? 'x la null thi  in ve sau ra');
  x ??= 'Nếu x bằng null thì gán x bằng String này';
  // ?. kiem tr do co null ko neu ko thi goi phuong thuc phia sau ra
  // không sử dụng generic
  var list = [1, 'a', true];

  // sử dụng generic
  var intList = <int>[
    1,
    2,
    3
  ]; // một list object có kiểu int <=> listOf<Int>(1, 2, 3) trong Kotlin

  var numList = <num>[1, 2, 3.333]; // một list object kiểu num
  var dynamicList = <dynamic>[1, 'a', true]; // một list object có type bất kỳ
  var intLists = <int>[1, 2, 3]; // một list object có kiểu int

  // add phần tử
  intLists.add(4);

  // update phần tử tại index
  intLists[0] = 5;

  // remove phần tử tại index
  intLists.removeAt(0);

  // get phần tử tại index
  var b = intLists[0];
  var nav = [
    'Home',
    'Furniture',
    'Plants',
    if (isMine) 'Outlet'
  ]; // chỉ khi biến isMine == true thì 'Outlet' mới được add vào list và ngược lại
  var listOfInts = [1, 2, 3];
  var listOfStrings = ['số 0', for (var i in listOfInts) 'số $i'];
  print(listOfStrings);
  var listA = [1, 2, 3];
  var listB = [0, ...listA]; // addAll tất cả phần tử của listA vào listB
  print(listB); // in ra: [0, 1, 2, 3]
  var listC; // listA đang null
  var listD = [0, 1, ...?listC]; // nên listC sẽ không được addAll vào listB
  print(listD); // in ra: [0, 1]
// kieu List
  var c = List.unmodifiable(<int>[1, 2]);
  c.add(3);
  var d = List.unmodifiable(<int>[1, 2]);
  d.add(3); // throw Exception
  d[0] = 1; // throw Exception
  d.removeAt(0); // throw Exception
  // Cách 2
  var a = const [1, 2, 3];
  a.add(4); // throw Exception
  a[1] = 1; // throw Exception
  a.removeAt(0); // throw Exception

  // Cách 3
  const e = [1, 2, 3];
  e.add(4); // throw Exception
  e[1] = 1; // throw Exception
  e.removeAt(0); // throw Exception
// không sử dụng generic
  var set = {1, 'a', true};

  // sử dụng generic
  var intSet = <int>{
    1,
    2,
    3,
    2,
    3,
    4
  }; // <=> setOf<Int>(1, 2, 3, 2, 3, 4) trong Kotlin
  print(intSet); // in ra: {1, 2, 3, 4}
  // không sử dụng generic
  var map = {1: 3, 'a': 3.3, 0.333: true};

  // sử dụng generic
  var genericMap = <int, dynamic>{1: 3, 2: 3.3, 3: true};
  print(genericMap); // in ra: {1: 3, 2: 3.3, 3: true}

  // Hàm put
  genericMap[5] = 'abc';

  // Hàm get
  var g = genericMap[5];
  print(g); // in ra: abc
  var names = {}; // Tạo ra một Map rỗng, ko phải Set
  //Nếu chúng ta muốn tạo ra một Set rỗng có thể làm như sau:
  var namess = <String>{};
// hoặc
  Set<String> otherNamess = {};
}
