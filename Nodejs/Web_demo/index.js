var createBtn = document.querySelector("#create");
var updateBtn = document.querySelector("#update");
var cancelBtn = document.querySelector("#cancel");
var inpName = document.querySelector('input[name="name"]');
var inpDesc = document.querySelector('input[name="description"]');
var inpFind = document.querySelector('input[name="find"]');
var findBtn = document.querySelector('#find')

var courseApi = "http://localhost:3000/courses";

function start() {
	getCourses(function (courses) {
		renderCourse(courses);
	});
	handleCreateForm();
}

start();
// Functions
function getCourses(callback) {
	fetch(courseApi)
		.then(function (response) {
			return response.json();
		})
		.then(callback);
}
function renderCourse(courses) {
	var listCoursesBlock = document.querySelector("#list-courses");
	var htmls = courses.map(function (course) {
		return `
            <li class="course-item-${course.id} course-item">
                <h4>${course.name}</h4>
                <p>${course.description}</p>
                <button class="delete" onClick="handleDeleteCourse(${course.id})">DELETE</button>
                <button class="change" onClick="handleUpdateCourse(${course.id},'${course.name}','${course.description}')">CHANGE</button>
            </li>
        `;
	});


	listCoursesBlock.innerHTML = htmls.join("");
}

function createCourse(data, callback) {
	var options = {
		method: "POST",
		headers: {
			"Content-Type": "application/json",
		},
		body: JSON.stringify(data),
	};

	fetch(courseApi, options)
		.then(function (response) {
			return response.json();
		})
		.then(callback);

}

function updateCourse(id, data, callback) {
	var options = {
		method: "PUT",
		headers: {
			"Content-Type": "application/json",
		},
		body: JSON.stringify(data),
	};

	fetch(courseApi + "/" + id, options)
		.then(function (response) {
			return response.json();
		})
		.then(callback);
}

console.log(updateBtn.hidden);

function handleUpdateCourse(id, name, description) {
	inpName.value = name;
	inpDesc.value = description;
	// createBtn.hidden = true;
	// updateBtn.hidden = false;
	// cancelBtn.hidden = false;
	createBtn.classList.add("btn--hidden");
	createBtn.classList.remove("btn--nonehidden");
	updateBtn.classList.add("btn--nonehidden");
	cancelBtn.classList.add("btn--nonehidden");

	cancelBtn.onclick = function () {

		createBtn.classList.add("btn--nonehidden");
		updateBtn.classList.add("btn--hidden");
		cancelBtn.classList.add("btn--hidden");
		cancelBtn.classList.remove("btn--nonehidden");
		updateBtn.classList.remove("btn--nonehidden");

		inpName.value = "";
		inpDesc.value = "";
	};

	updateBtn.onclick = function () {
		var name = inpName.value;
		var description = inpDesc.value;
		var formData = {
			name: name,
			description: description,
		};

		updateCourse(id, formData, function () {
			getCourses(renderCourse);
		});
	};
}

function handleDeleteCourse(id) {
	var options = {
		method: "DELETE",
		headers: {
			"Content-Type": "application/json",
		},
	};

	fetch(courseApi + "/" + id, options)
		.then(function (response) {
			return response.json();
		})
		.then(function () {
			var courseItem = document.querySelector(".course-item-" + id);
			if (courseItem) courseItem.remove();
		});
}

function handleCancelCourse() {
	createBtn.onclick = function () {
		var name = inpName.value;
		var description = inpDesc.value;

		var formData = {
			name: name,
			description: description,
		};

		createCourse(formData, function () {
			getCourses(renderCourse);
		});

	};
}
function handleCreateForm() {
	createBtn.onclick = function () {

		var name = inpName.value;
		var description = inpDesc.value;

		var formData = {
			name: name,
			description: description,
		};
		if (name != "" && description != "") {
			createCourse(formData, function () {
				console.log("🚀 ~ file: index.js ~ line 153 ~ getCourses(renderCourse)", getCourses(renderCourse))
				console.log("🚀 ~ file: index.js ~ line 153 ~ getCourses(renderCourse)", getCourses(renderCourse))
				console.log("🚀 ~ file: index.js ~ line 153 ~ getCourses(renderCourse)", getCourses(renderCourse))
				console.log("🚀 ~ file: index.js ~ line 153 ~ getCourses(renderCourse)", getCourses(renderCourse))
				console.log("🚀 ~ file: index.js ~ line 153 ~ getCourses(renderCourse)", getCourses(renderCourse))
				getCourses(renderCourse);
			});
		}
	};
}
Array.prototype.myFilter = function (callBack) {
	var output = [];
	for (var index in this) {
		if (this.hasOwnProperty(index)) {
			var result = callBack(this[index], index, this);
			if (result) {
				output.push(this[index]);
			}
		}
	}
	return output;
};

function handleFindCourse() {

	fetch(courseApi)
		.then(function (response) { return response.json() })
		//JSON.parse JSON-> JavaScript types
		.then(function (posts) {
			var findValue;

			var listCourses = posts.myFilter(function (post, index) {
				findValue = inpFind.value;
				return post.name.toLowerCase() === findValue.toLowerCase()
					|| post.description.toLowerCase() === findValue.toLowerCase();

			});
			
			if (findValue != "") {

				renderCourse(listCourses);
			} else {
				renderCourse(posts);
			}
		})
		.catch(function (error) { console.log("error") });
	// fake API qua thư viện JSON Server
}
