// dom event

// input / select
// keyup/ down

var inputTextElement = document.querySelector('input[type="text');
// onchange tra lai van ban khac voi van ban truoc do
//oninput khac toi dau tra lai toi do
inputTextElement.onchange = function (e) {
  console.log(e.onchange.value);
};
inputTextElement.oninput = function (e) {
  console.log(e.onchange.value);
};
var inputBoxElement = document.querySelector('input[type="checkbox"]');
inputBoxElement.onchange = function (e) {
  console.log(e.target.checked);
};
var selectElement = document.querySelector("select");
selectElement.onchange = function (e) {
  console.log(e.target.value);
};
// onkeyUp sau khi nhac len
// onkeyDown sau khi nhac xuong
// okeyPress nhan giu no
inputTextElement.onkeyUp = function (e) {
  console.log(e.which);
  switch (e.which) {
    case 27:
      console.log("exit");
      break;
  }
};
