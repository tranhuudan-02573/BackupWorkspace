// front-end: xây dựng giao diện người dùng
// back-end:xây dựng logic xử lý + cơ sở dữ liệu

// Fetch: API(URL)->Application programming interfaces
// cổng giao tiếp giữa các PM
// back-end->API(URL)->Fetch->JSON->JSON.parse->JavaScript types-Render ra giao diện với HTML


var postAPI = "http://localhost:3000/courses";
fetch(postAPI)
    .then(function (response) { return response.json() })
    //JSON.parse JSON-> JavaScript types
    .then(function (posts) {
   console.log(posts)

        var htmls = posts.map(function (post) {
            return`<li>
                <h2>${post.name}</h2>
                <p>${post.description}</p>
             </li>`;
        });
        var html = htmls.join('');
        document.getElementById('post-block').innerHTML = html;

    })
    .catch(function (error) { console.log(error) });
    // fake API qua thư viện JSON Server
