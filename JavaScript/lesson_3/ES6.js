// 1. let,const
// 2. template literals
// 3. multi-line String `${} ${}` su dung cac ki tu dac biet bang cach \
// 4. arrow function
// 5. classes
// 6. default parameter values
// 7. destructuring
// 8. rest parameters(...)
// 9. spread(...)
// 10. enhanced object literals
// 11. tagged template literal
// 12. modules import / export
// 13. optional chaining (?.)

//  babel

// 1. var / let, const: scope, hoisting(khai bao bien o duoi cung duoc hoisting se day len tren dau tien con let voi const thi khong)
// 2. const / var, let: assignment const ko gan lai duoc phai thay doi ten bien


// function logger(log) {
// console.log(log);
// }

// const logger = function (log) {
// console.log(log);
// }

// constructor function
// function Course(name, price) {
//     this.name = name;
//     this.price = price;
//     this.getName = function () {
//         return this.name;
//     }
// }

class Course {
    constructor (name, price) {
        this.name = name;
        this.price = price;
    }
    getName() {
        return this.name;
    }
}
// default parameter values nhung tham so ko bat buoc phai nhap
function logger(log = 'gia tri mac dinh') {
    console.log(log);
}
logger();//gia tri mac dinh

//  enhanced object literals

// 1. dinh nghia key: value cho object
// 2. dinh nghia method cho objects
// 3. dinh nghia key cho object duoi dang bien
var name2 = 'javascript'
var price = 1000
var course2 = {
    name2,
    price,
    getName() {
        return name2;
    }
}
console.log(course2.getName());//javascript

var fieldName= 'name'
var fieldPrice = 'price'

const course3 = {

    [fieldName]: 'javascript',
    [fieldPrice]:1000
}
console.log(course3);//{ name: 'javascript', price: 1000 }

// destructuring lấy các phần tử trong mảng ra 1 cách gọn gàng và nhanh chóng
var array = ['javascript', 'java', 'PHP']
// var [a, b, c] = array
// console.log(a,b,c);
var [a, b ,...rest] = array
console.log(rest);//[ 'PHP' ]
var course4 = {
    name: 'java',
    price: 1000,
    image: 'image-address',
    children: {
        name: 'javascript'
    }
}
// var { name, price, image } = course4
// console.log(name,price,image);
// console.log(rest);
// var { name,...rest} = course4
var { name: parentName, children: { name: childrenName },defaultDescription='defaultDescription' } = course4
console.log(parentName);//java
console.log(childrenName);//javascript
console.log(defaultDescription);//defaultDescription
// rest parameters
function loggers(a,...params) {
    console.log(params);
}
loggers(1, 2, 3, 4, 5)//[ 1, 2, 3, 4, 5 ]

function loggerss({ name,...rest }) {
    console.log(name);
    console.log(rest);
}
loggerss({ name: 'javascript', price: 1000, description: 'description' })//{ price: 1000, description: 'description' }


function loggersss([a,b,...rest]) {
    console.log(a);//2
    console.log(b);//5
    console.log(rest);//[ 4, 65, 3, 2 ]
}
loggersss([2, 5, 4, 65, 3, 2])//{ price: 1000, description: 'description' }

// spread
var arr2 = ['java', 'javascript', 'PHP']
var arr3 = ['dart', 'nodeJs']
var arr4 = [...arr3, ...arr2]
console.log(arr4);//[ 'dart', 'nodeJs', 'java', 'javascript', 'PHP' ]

var obj1 = {
    name:'javascript'
}
var obj2 = {
    price: 1000
}
var obj3 = {
    ...obj1,
    ...obj2
}
console.log(obj3);//{ name: 'javascript', price: 1000 }

//  tagged template literal
function highlight([first, ...Strings], ...values) {
    console.log(first);//hoc lap trinh
    console.log(Strings);//[ 'tai ', '!' ]
    console.log(values);//[ 'javascript', 'F8' ]
    return values.reduce((acc, curr) => [...acc, `<span>${curr}</span>`, Strings.shift()], [first]).join('');
}
var brand = 'F8';
var course = 'javascript'
const html = highlight`hoc lap trinh ${course}tai ${brand}!`
console.log(html);//hoc lap trinh <span>javascript</span>tai <span>F8</span>!

// optional chaining
const adventurer = {
  name: 'Alice',
  cat: {
      name: 'Dinah',
      cat2: {
          name: 'abc',
          cat3: {
              name: 'bcd',
              cat4: {
                  name: 'cde'
              }
          }
      }

  }
};
// Syntax
// obj.val?.prop
// obj.val?.[expr]
// obj.arr?.[index]
// obj.func?.(args)
const dogName = adventurer.dog?.name;
console.log(dogName);
// expected output: undefined

console.log(adventurer.someNonExistentMethod?.());
// expected output: undefined

if (adventurer?.cat?.cat2?.cat3?.cat4) {
    console.log(adventurer.cat.cat2.cat3.cat4.name);
}
