alert('hi');
confirm('xac nhan ban da du tuoi');
prompt('xac nhan ban du tuỏi');
setTimeout(function () {
  alert('thong bao');
}, 1000);
setInterval(function () {
  console.log('thong bao');
}, 1000);
const sum = (...args) => {
  return args.reduce((a, b) => a + b, 0);
};
console.log(sum(1, 2, 3)); // 6
// false
/**
 * 0
 * ''
 * false
 * underfined
 * NaN
 * null
 */

// doi tuong date
var date = new Date();
var year = date.getFullYear();
var month = date.getMonth() + 1;
var day = date.getDate();
console.log(`${day}/${month}/${year}`);

// toan tu ++ --

var number = 6

var output = ++number + ++number;
// output = 6 + (7-1)
console.log(output);
