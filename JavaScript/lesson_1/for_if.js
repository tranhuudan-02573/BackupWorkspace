//if else: < > !==
// switch case: biet truoc gia tri so case < 3

// for loop
var myArray = ['javaScript', 'PHP', 'java', 'Dark', 'Ruby', 'Python'];
var arrayLength = myArray.length; // nen tach ra nhu nay de hieu suat duoc toi uu hon
for (var i = 0; i < arrayLength; i++) {
  console.log(myArray[i]);
}
// for in vong lap for lay ra key cua object
for (var key in myInfo) {
  console.log(key);
  // hoac co the lay ra duoc value cua obj bang cach
  console.log(myInfo[key]);
}
// hoac for in duoc dung trong mang array
for (var key in myArray) {
  console.log(key);
  //value
  console.log(myArray[key]);
}
// hoac co the dung for in trong chuoi
var myString = 'tran huu dan';
for (var key in myString) {
  console.log(key); // ki tu

  console.log(myString[key]); // tach ra nhieu chu cai
}

// for of lay value
// array
for (var value of myArray) {
  console.log(value);
}
// obj
var emailKey = 'email';
var myInfo = {
  name: 'dan',
  age: 18,
  address: 'HCM',
  [emailKey]: 'tranhuudan@gmail.com',
  getName: function () {
    return this.name;
  },
};
// myInfo.email = 'tranhuudan@gmail.com'
// hoac myInfo.['my-email] =  'tranhuudan@gmail.com'
console.log(myInfo.getName());
console.log(myInfo.name);
var myKey = 'name';
// hoac console.log(myInfo['name'])
// hoac console.log(myInfo[myKey])
delete myInfo.name;
for (var value of Object.values(myInfo)) {
  console.log(value);
}
for (var key of Object.keys(myInfo)) {
  console.log(key);
  //value
  console.log(myInfo[key]);
}
//obj
// string
for (var value of myString) {
  console.log(value);
}
// while
var i = 0;
while (i < myArray.length) {
  console.log(myArray[i]);
  i++;
}
// do while loop
var i = 0;
var isSuccess = false;
do {
  i++;
  console.log('nap the lan ' + i);
  // thanh cong
  if (true) {
    isSuccess = true;
  }
} while ((!isSuccess, i <= 3));

// break and continue in loop

// /nested loop
