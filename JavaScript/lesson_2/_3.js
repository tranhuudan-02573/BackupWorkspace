// 1 preventDefault: loai bo di hanh vi mac dinh cua trinh duyet hoac cua 1 element nao do
// 2 stopPropagation: loai bo di hanh vi noi bot
var aElement = document.link;
for (var i = 0; i < aElement.length; i++) {
  aElement;
  [i].onclick = function (e) {
    if (
      !e.target.href.startsWith("https://www.youtube.com/watch?v=v9_bqqVRWtU")
    ) {
      e.preventDefault();
    }
  };
}
var ulElement = document.querySelector("ul");
ulElement.onclick = function (e) {
  console.log(e.target);
};

ulElement.onmousedown = function (e) {
  e.preventDefault();
};
document.querySelector("div").onclick = function (e) {
  console.log("div");
};
document.querySelector("button").onclick = function (e) {
  e.stopPropagation();
  console.log("button");
};
