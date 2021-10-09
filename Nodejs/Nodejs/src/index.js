// Expressjs là một framework được xây dựng trên nền tảng của Nodejs. Nó cung cấp các tính năng mạnh mẽ để phát triển web hoặc mobile. Expressjs hỗ trợ các method HTTP và midleware tạo ra API vô cùng mạnh mẽ và dễ sử dụng.
// Morgan: là một phần mềm trung gian khác của trình ghi nhật ký yêu cầu HTTP cho Node.js. Nó đơn giản hóa quá trình ghi yêu cầu vào ứng dụng của bạn. Bạn có thể nghĩ về Morgan như một người trợ giúp thu thập nhật ký từ máy chủ của bạn, chẳng hạn như nhật ký yêu cầu của bạn. Nó tiết kiệm thời gian cho các nhà phát triển vì họ không phải tạo các nhật ký chung theo cách thủ công. Nó chuẩn hóa và tự động tạo nhật ký yêu cầu.
// Cũng giống như bất kì package NPM nào khác, bạn cần phải npm install module express, sau đó sử dụng lệnh require để load module.
const path = require('path');
const express = require('express');//hiring the manager

const morgan = require('morgan');
const app = express();//Điều này cho express đăng nhập qua morgan //hiring the manager

// Handlebars là một thư viện javascrip .rất mạnh mẽ hỗ trợ bạn có thể binding data vào một templete để hiển thị ra website.
const handlebars = require('express-handlebars');
const port = 3000;
app.use(express.static(path.join(__dirname, 'public')));
// HTTP logger
app.use(morgan('combined'))//và morgan để đăng nhập vào định dạng được xác định trước "combined" // got shirt and shoes
// template engine
app.engine('hbs', handlebars({
  extname: 'hbs',
}));
// middleware
// post method
app.use(express.urlencoded({
  extended: true,
}));
app.use(express.json())
//XMLHttpRequest, fetch, axios, ajax..
app.set('view engine', 'hbs')
app.set('views', path.join(__dirname, 'resourses/views'));
app.get('/', (req, res) => {// talking an order
  // res.send(`<h1>Hello World!</h1>`)
  res.render('home')
})
app.get('/news', (req, res) => {// talking an order
  // res.send(`<h1>Hello World!</h1>`)
  res.render('news');
})
// query parameters
// thường dùng cho GET -> ...?q=...&...=...&...=... key value truyền trên url/uri
app.get('/search', (req, res) => {// talking an order
  // res.send(`<h1>Hello World!</h1>`)
  console.log(req.query.q);
  console.log(req.query);
  res.render('search');
})
app.post('/search', (req, res) => {// talking an order
  // res.send(`<h1>Hello World!</h1>`)
  console.log(req.body);
  res.send('');
})// phuong thuc post cua form se nhay vao day
// 127.0.0.1 - localhost
app.listen(port, () => {//open for business
  console.log(`Example app listening at http://localhost:${port}`);
})

//npm install express
//npm install express-handlebars
//npm i morgan --save-dev
//npm i node-sass --save-dev
//npm i nodemon --save-dev
