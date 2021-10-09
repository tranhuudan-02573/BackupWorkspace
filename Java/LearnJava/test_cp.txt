// promise demo
var user = [
  { id: 1, name: "huudan" },
  { id: 2, name: "thuytien" },
  { id: 3, name: "minhthuan" },
];
var comments = [
  { id: 1, user_id: 1, content: " anh yeu em nhieu lam <3" },
  { id: 2, user_id: 2, content: " em cung vay a hihi^^" },
  { id: 3, user_id: 1, content: " thuong thuc su lun" },
];
// 1. lấy comments
// 2. từ comments lấy user_id
// 3. từ user_id lấy ra user tương ứng

// fake API
function getComments() {
  return new Promise(function (resolve) {
    setTimeout(function () {
      resolve(comments);
    }, 1000);
  });
}
getComments()
  .then(function (comments) {
    var userIds = comments.map(function (comment) {
      return comment.user_id;
    });
    return getUsersByIds(userIds).then(function (users) {
      return { users: users, comments: comments };
    });
  })
  .then(function (data) {
    var html = "";
    var commentBlock = document.getElementById("comment-block");
    data.comments.filter(function (comment) {
      var user = data.users.find(function (user) {
          return user.id === comment.user_id;
      });
      html+=`<li>${user.name}:${comment.content}</li>`;
    });
    commentBlock.innerHTML = html;
  });
function getUsersByIds(UserIds) {
  return new Promise(function (resolve) {
    var result = user.filter(function (user) {
      return UserIds.includes(user.id);
    });
    resolve(result);

  });
}

//1. array
// 2.callback, function
// 3.promise
//4.DOM
