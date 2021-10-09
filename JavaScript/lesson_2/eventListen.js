//1. event listener
// 2. JSON
// 3.Fetch
// 4.DOM Location
// 5, Local storage
// 6.session storage
// 7.coding convention
// 8 best practice
// 9 mistakes
// 10 performance
// 11. promise
// -sync: đồng bộ
//-async: bất đồng bộ setTimeout, setInterval, fetch, XMLHttpRequest, đọc file,request animation frame

// nỗi đau:
// 1.callback hell
// 2.pyramid of doom
//  lý thuyết cách hoạt động
//performance
// 1 xử lí quá nhiều việc khi event xảy ra
// 2 lắng nghe / hủy bỏ lắng nghe

var btn = document.getElementById("btn");
function viec1() {
  console.log("viec 1 ");
}
function viec2() {
  console.log("viec2 ");
}
btn.addEventListener("click", viec1);
btn.addEventListener("click", viec2);
setTimeout(function () {
  btn.removeEventListener("click", viec1);
}, 3000);

// JSON
// 1 là 1 kiểu định dạng dữ liệu( chuỗi)
//2 javascript objects notations
//3JSON: number, string, boolean, objects, arrays

// mã hóa / giãi mã
// encode / decode
// stringify:  từ javascript type sang JSON/ parse: từ JSON sang javascript type

//  var json = '["javascript","PHP","java"]'
// var json = '{"name":"huu dan","age":"18"}';
var a = '"abc"';
console.log(JSON.parse(a));

console.log(JSON.stringify({ name: "huu dan", age: "18" }));

// promise
// new promise
// excutor
// trạng thái của promise:
// 1.pendding
// 2.fulfill
// 3. reject
var promise = new Promise(
  // excutor
  function (resolve, reject) {
    // logic
    // thành công: resolve()
    // thất bại: reject()
    // fake call API

    // reject("co loi");

    // resolve([
    //   {
    //     id: 1,
    //     name: "javascript",
    //   },
    // ]);
    resolve();
  }
);
promise
  // .then(function (course) {
  //   console.log(course);
  // })
  .then(function () {
    return new Promise(function (resolve) {
      setTimeout(function () {
        resolve([1, 2, 3]);
      }, 3000);
    });
  })
  // then truoc tra ve new Promise nen then nay goi boi promise do data la resolve
  .then(function (data) {
    console.log(data);
    return 2;
  })
  .then(function (data) {
    return 3;
    console.log(data);
  })
  .then(function (data) {
    console.log(data);
  })

  .catch(function (error) {
    console.log(error);
  })
  .finally(function () {
    console.log("done!");
  });
// demo setInterval
function sleep(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}
sleep(1000)
  .then(function () {
    console.log("1");
    return sleep(1000);
  })
  .then(function () {
    console.log("2");
    return new Promise((resolve, reject) => reject("co loi! "));
  })
  .then(function () {
    console.log("3");
    return sleep(1000);
  })
  .then(function () {
    console.log("4");
    return sleep(1000);
  })
  .catch(function (error) {
    console.log(error);
  });
//1. Promise.resolve
// 2. Promise.reject
// 3. Promise.all

// var promise2 = new Promise((resolve, reject) => resolve("success!"));
var promise2 = Promise.resolve("success!");
promise2
  .then(function (result) {
    console.log("result" + result);
  })
  .catch((error) => console.log(error));

var promise3 = new Promise(function (resolve) {
  setTimeout(function () {
    resolve([1]);
  }, 2000);
});

var promise4 = new Promise(function (resolve) {
  setTimeout(function () {
    resolve([2, 3]);
  }, 3000);
});
// chi mat 3s
Promise.all([promise3, promise4])
  .then(function (result) {
    var result1 = result[0];
    var result2 = result[1];
    console.log(result1.concat(result2));
  })
  .catch(function (error) {
    console.log(error);
  });
