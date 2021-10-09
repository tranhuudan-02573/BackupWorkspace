/**
 * lam viec voi array
 *
 * 1.To string
 * 2. Join
 * 3.Pop
 * 4.Push
 * 5. Shift
 * 6. Unshift
 * 7.Splicing
 * 8.Concat
 * 9.Slicing
 */
var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
console.log(languages2.toString);

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
console.log(languages2.join(" - "));

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
console.log(languages2.pop()); // xoa phan tu cuoi mang va tra ve phan tu da xoa

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
console.log(languages2.push("dark", "java")); // them 1 hoac nhieu phan tu vao cuoi mang va tra ve do dai moi cua mang

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
console.log(languages2.shift()); // xoa phan tu dau mang va tra ve phan tu da xoa

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];

console.log(languages2.unshift("dark", "java")); // them 1 hoac nhieu phan tu vao dau mang va tra ve do dai moi cua mang

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
languages2.splice(0, 1); // tu phan tu thu 1 cua mang xoa di 1 phan tu o sau do va tra ve phan tu da xoa
console.log(languages2);

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
languages2.splice(1, 0, "dark", "java"); // chen phan tu moi vao
console.log(languages2);

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];
console.log(languages1.concat(languages2)); // noi mang

var languages2 = ["javascript", "PHP", "Ruby"];
var languages1 = ["java", "python", "dark"];

//xao tron cac phan tu trong mang
console.log(
  languages1.sort(function () {
    return Math.random() - 0.5;
  })
);

//array method
/**
 * forEach()
 * every()
 * some()
 * find()
 * filter()
 * map()
 * reduce()
 *
 */

var courses = [
  {
    id: 1,
    name: "javascript",
    coin: 250,
  },
  {
    id: 2,
    name: "HTML,CSS",
    coin: 0,
  },
  {
    id: 4,
    name: "PHP",
    coin: 400,
  },
  {
    id: 5,
    name: "reactJS",
    coin: 500,
  },
  {
    id: 6,
    name: "PHP",
    coin: 800,
  },
  {
    id: 7,
    name: "PHP",
    coin: 1200,
  },
];
//duyet qua cac phan tu cua mang
courses.forEach(function (course, index) {
  // callback
  console.log(index, course);
});
// giong vong lap kiem tra het phan tu cua mang
var isFree = courses.every(function (course, index) {
  // callback
  return courses.coin === 0;
});

console.log(isFree);

// dieu kien dung
var isFree = courses.some(function (course, index) {
  // callback
  return course.coin === 0;
}); // false
console.log(isFree);
// tim kiem tra ve 1 phan tu dung dau tien
var course = courses.find(function (course, index) {
  // callback
  return course.name === "PHP";
});
console.log(course);

var listCourses = courses.filter(function (course, index) {
  // callback
  return course.name === "PHP";
});
console.log(listCourses);

// map() thay doi element cua array cung 1 luc
function courseHandler(course, index) {
  console.log(course);
  return {
    id: course.id,
    name: `khoa hoc: ${course.name}`,
    coin: course.coin,
    coinText: `gia: ${course.coin}`,
    index: index,
  };
}

var newCourses = courses.map(courseHandler);

// reduce
// bien luu tru
// thuc hien viec luu tru
var i = 0;
function coinHandler(accumulator, currentValue) {
  i++;
  var total = accumulator + currentValue.coin;
  console.table({
    "luot chay: ": i,
    "bien tich tru: ": accumulator,
    "gia khoa hoc: ": currentValue.coin,
    "tich tru duoc: ": total,
  });
  console.log(currentValue);
  return total;
}
var totalCoin = courses.reduce(coinHandler, 0); // inital value
console.log(totalCoin);

// bai toan
var totalCoin = courses.reduce(function (accumulator, currentValue) {
  return accumulator + currentValue.coin;
}, 0);
console.log(totalCoin);

// Flat - lam phang mang tu Depth array - mang sau
var depthArray = [1, 2, [3, 4], 5, 6, [7, 8, 9]];
var flatArray = depthArray.reduce(function (a, b) {
  return a.concat(b);
}, []);

// lay ra cac khoa hoc va dua vao mang moi

var topics = [
  {
    topic: "front-end",
    courses: [
      { id: 1, title: "HTML,CSS" },
      { id: 2, title: "javascript" },
    ],
  },
  {
    topic: "back-end",
    courses: [
      { id: 1, title: "PHP" },
      { id: 2, title: "nodeJS" },
    ],
  },
];
var newCourse = topics.reduce(function (courses, topic) {
  return courses.concat(topic.courses);
}, []);
console.log(newCourses);

var html = newCourse.map(function (course) {
  return `
      <div>
      <h2>${course.title}</h2>
      <p>ID: ${course.id}</p>
      </div>
    `;
});
console.log(html.join(""));

// string/ array includes method
console.log(String.prototype.includes);
console.log(Array.prototype.includes);

var title = "Responsive web design";
console.log(title.includes("web design", 1)); // true

var coursess = ["javascript", "PHP", "java"];
// 3+ -3= 0
console.log(coursess.includes("ruby", -3)); // false
