var myString = 'hoc JS tai F8!';
console.log(typeof myString);

//   1.length
console.log(myString.length);
//   2.find index
console.log(myString.search('JS'));
//   3.cut String
console.log(myString.slice(4, 6));
//   4.replace
console.log(myString.repalce(/JS/g, 'javascript'));
//   5.convert to upper case
console.log(myString.toUpperCase());
//   6.trim
console.log(myString.trim());
// 7.split
var languages = 'javascript, PHP, rubby';
console.log(languages.split(', '));
//   8.get a character by index
console.log(myString.charAt(10));

var result = 20 / 'ABC';
var PI = 3.1464786543;
console.log(isNaN(result)); //true
console.log(PI.toFixed(2));

function writeLog() {
  var myString = '';
  for (var param of arguments) {
    myString += `$(param) - `;
  }
  console.log(myString);
}
writeLog('log1', 'log2', 'log3');
