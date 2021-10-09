// HTML DOM
// 1.element:
// ID: trả về 1 element, class: trả về mảng, tag, querySelector: trả về 1 element, HTML collection(img,a,form,...): trả về HTMLCollection(array),querySelectorAll:trả về 1 nodeList(array)

// 2.Attribute
// 3.Text

var headingNode1 = document.getElementById("heading");
var headingNode2 = document.querySelector(".heading");
var headingNode3 = document.querySelector(".box .heading:first-child");
var headingNode4 = document.querySelector(".box .heading:nth-child(2)");
var headingNode7 = document.querySelectorAll(".box .heading");

var headingNode5 = document.getElementsByClassName("heading");
var headingNode6 = document.getElementsByTagName("h1");

console.log({
  Element: headingNode1,
}); //return object
console.log(headingNode1); // return element
console.log(headingNode2); // return element
console.log(headingNode3); // return element
console.log(headingNode4); // return element
console.log(headingNode5); // return array
console.log(headingNode6); // return array
console.log(headingNode7[1]); // return element

// html collection
console.log(document.forms[0]); // return element
console.log(document.forms["form-1"]); // return element
console.log(document.forms.testForm); // return element
console.log(document.anchors); // thẻ a cần có thuộc tính name return array
console.log(document.images); // trả về tất cả các hình ảnh return array
var boxNode = document.querySelector(".box1");
console.log(boxNode); // return element
console.log(boxNode.getElementsByTagName("li")); // return HTML collection(array)
console.log(boxNode.querySelectorAll("p")); // return nodeList(array)

// DOM Attribute
var headingElement = document.querySelector("h1");
headingElement.className = "heading";
headingElement.id = "heading";
headingElement.title = "heading";

// doi voi the a thi them href moi duoc

// hoac dung phuong thuc
headingElement.setAttribute("class", "heading");
// cach nay co the set bat cu loai Attribute nao vao trong element
console.log(headingElement.getAttribute("class"));
// lay text ra
// innerText : la thuoc tinh cua element lay ra text duoc hien thi tren man hinh
// textContent: ;la thuoc tinh cua element va ca cua text lay ra cac text co trong the do ke ca script hay style
console.log(headingElement.innerText);
console.log(headingElement.textContent);
// thay doi cap nhat text

// khi bo trong dau nay textContent se ko duoc hieu cac xuong dong ma chi toa ra text moi do con innerText thi nguoc lai no lay ca cac khoang cach khi xuong dong
headingElement.textContent = `


new heading
`;
headingElement.innerText = `


new heading
`;
// thuoc tinh cua element
// innerHTML va outerHTML
// inner la no them vao lm con cua no
var boxElement = document.querySelector(".box");
// cac element contribute va text nam trong nay
console.log([boxElement]);
// boxElement.innerHTML = '<h1 title ="heading2">Heading abc</h1>';
console.log(boxElement.innerHTML);
// outer ghi de len class ma no dag dung do
// boxElement.outerHTML = "<span>hello viet nam</span>";

// cac thuoc tinh cua element
console.log(boxElement.style);
boxElement.style.width = "100px";
boxElement.style.height = "200px";
boxElement.style.backgroundColor = "red";
// hoac ngan gon hon khi css 1 element
Object.assign(boxElement.style, {
  width: "200px",
  height: "100px",
  backgroundColor: "bue",
});

// thuoc tinh classList// domTokenList
// cac phuong thuc
//add: them class vao element
//contains: kiem tra class do co nam trong element nay hay ko
// remove: xoa bo 1 class khoi element cua b
// toggle:
console.log(boxElement.classList); // la 1 array
// boxElement.classList.add("red", "green", "blue");

console.log(boxElement.classList.contains("red"));
// setTimeout sau bn giay do se thuc hien khoi lenh
setTimeout(() => {
  boxElement.classList.remove("red");
}, 3000);
// sau bn giay do se thuc hien di thuc hien lai khoi lenh
setInterval(() => {
  boxElement.classList.toggle("red");
}, 3000);
var boxElement = document.querySelectorAll(".box .heading");
for (var i = 0; i < boxElement.length; i++) {
  boxElement[i].onclick = function (e) {
    console.log(e.target);
  };
}
boxElement.onclick = function () {
  console.log(Math.random());
};
