/**
 * math object
 *
 * Math.PI
 * Math.Round
 * Math.abs()
 * Math.ceil()
 * Math.floor()
 * Math.random()
 * Math.min()
 * Math.max()
 *
 */

console.log(Math.PI);
console.log(Math.round(1.3)); // lam tron so
console.log(Math.abs(-4)); // gia tri tuyet doi
console.log(Math.ceil(1.000001)); // lam tron tren -> 2
console.log(Math.ceil(1.99999)); // lam tron duoi -> 1
console.log(Math.floor(Math.random() * 10)); // so nguyen ngau nhien tu 1 den 10

var random = Math.floor(Math.random() * 10);
if (random < 5) {
  console.log("cuong hoa thanh cong!");
}

// vi du
var bonus = ["10 coin", "50 coin", "30 coin", "30 coin", "20 coin"];
console.log(bonus[random]);

console.log(Math.min(-100, 78, 293, 487));
