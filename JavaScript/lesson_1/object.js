// object contructor
function User(firstName, lastName, avatar) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.avatar = avatar;
  this.getName = function () {
    return `${this.firstName} ${this.lastName}`;
  };
}
var author = new User('huu', 'dan', 'avatar');
var user = new User('vu', 'nguyen', 'avatar');

author.title = 'chia se tai f8';
user.comment = 'hello ad';

// object prototype
User.prototype.className = 'F8';
User.prototype.getClassName = function () {
  return this.className;
};
console.log(user.className);
console.log(user.getClassName());

//tao thuoc tinh moi o ben ngoai ham tao prototype
console.log(author);
console.log(author.className());
console.log(user);
console.log(user.getClassName());


