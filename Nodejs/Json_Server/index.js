//Json:server: API server(fake)/mock server
// postman 1 cong cu lam viec voi API 1 cach nhanh chong
// 4 cong viecj tuong tac voi du lieu cua backend la CRUD
// create: tao moi->POST
//read:lay du lieu->GET
// update:chinh sua->PUT/ PATCH
// delete:xoa->DELETE
var coursesAPI = 'http://localhost:3000/courses'
fetch(coursesAPI)
    .then(function (response) {
        return response.json();
    })
    .then(function (course) {
        console.log(course);
    })
