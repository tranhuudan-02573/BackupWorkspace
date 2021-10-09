// callBack ?
//la ham (Function) duoc truyen qua doi so
// khi goi ham khac

// 1. la ham
// 2. duoc truyen qua doi so
// 3. duoc goi lai( trong ham nhan doi so)

function myFunction(param) {
	if (typeof param === "function") {
		console.log(typeof param);
		param("hc lap trinh");
	}
}
function myCallBack(value) {
	console.log("value: ", value);
}
// myFunction('hoc lap trinh tai F8');
myFunction(myCallBack);

// callBack p2
var course = ["javaScript", "java", "PHP"];

// nguyen ly hoat dong cua callBack map
Array.prototype.map2 = function (callBack) {
	var output = [];
	var arrayLength = this.length;

	for (var i = 0; i < arrayLength; ++i) {
		var result = callBack(this[i], i);
		output.push(result);
	}
	return output;
};

var myMap2 = course.map2(function (courses) {
	return `<h2>${courses}</h2>`;
});
console.log(myMap2.join(""));

// callBack

var myMap = course.map(function (courses) {
	return `<h2>${courses}</h2>`;
});
console.log(myMap2.join(""));

// nguyen ly hoat dong cua
/*forEach()
 * every()
 * some()
 * find()
 * filter()
 * reduce()
 */

// for in
// hasOwnProperty
// obj prototype

// nguyen ly hoat dong cua callBack for each
Array.prototype.forEach2 = function (callBack) {
	for (var index in course) {
		if (this.hasOwnProperty(index)) {
			callBack(this[index], index, this);
		}
	}
};
var myForEach2 = course.forEach2(function (courses, index, array) {
	console.log(courses, index, array);
});
//callBack for each
var myForEach = course.forEach(function (courses, index, array) {
	console.log(courses, index, array);
});

//Cách 2 dễ hiểu
Array.prototype.reduce2=function(callBack,initialValue){
    var i=0;
    if(initialValue===undefined){
        initialValue=this[0];
        i=1;
    }
    var total =initialValue;
    for( ; i < this.length ; i++){
        total=callBack(total,this[i],i, this);
    }

    return total;

}
var numbers = [1,2,3,4,5]
const result2=numbers.reduce2((total,number, index, arr) => {
    console.log(total,number, index, arr);
    return total + number;
},10);
console.log(result2);

var courses = [
	{
		id: 1,
		name: "javascript",
		coin: 250,
		isFinish: false,
	},
	{
		id: 2,
		name: "HTML,CSS",
		coin: 0,
		isFinish: false,
	},
	{
		id: 4,
		name: "PHP",
		coin: 400,
		isFinish: false,
	},
	{
		id: 5,
		name: "reactJS",
		coin: 500,
		isFinish: false,
	},
	{
		id: 6,
		name: "PHP",
		coin: 800,
		isFinish: false,
	},
	{
		id: 7,
		name: "PHP",
		coin: 1200,
		isFinish: false,
	},
];

Array.prototype.filter2 = function (callBack) {
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

var listCourses2 = courses.filter2(function (course, index) {
	// callback
	return course.name === "PHP";
});
console.log(listCourses2);

var listCourses = courses.filter(function (course, index) {
	// callback
	return course.name === "PHP";
});
console.log(listCourses);

Array.prototype.some2 = function (callback) {
	for (var index in this) {
		if (this.hasOwnProperty(index)) {
			var result = callback(this[index], index, this);
			if (result) {
				return true;
			}
		}
	}
	return false;
};

var listCourses2 = courses.some2(function (course, index) {
	// callback
	return course.isFinish;
});
console.log(listCourses2);
// some
var listCourses = courses.some(function (course, index) {
	// callback
	return course.isFinish;
});
console.log(listCourses);
// some == or
// every == and
Array.prototype.every2 = function (callback) {
	var output = true;
	for (var index in this) {
		if (this.hasOwnProperty(index)) {
			var result = callback(this[index], index, this);
			if (!result) {
				output = false;
				break;
			}
		}
	}
	return false;
};

var listCourses2 = courses.every2(function (course, index) {
	// callback
	return course.isFinish;
});
console.log(listCourses2);

var listCourses = courses.every(function (course, index) {
	// callback
	return course.isFinish;
});
console.log(listCourses);
