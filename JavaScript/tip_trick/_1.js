//Replace All
var example = "potato potato";
console.log(example.replace(/pot/, "tom"));
// "tomato potato"
console.log(example.replace(/pot/g, "tom"));
// "tomato tomato"

//Extract Unique Values
var entries = [1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 8, 4, 2, 1]
var unique_entries = [...new Set(entries)];
console.log(unique_entries);
// [1, 2, 3, 4, 5, 6, 7, 8]

// Convert number to string
var converted_number = 5 + "";
console.log(converted_number);
// 5
console.log(typeof converted_number);
// string

//Convert string to number
the_string = "123";
console.log(+the_string);
// 123

the_string = "hello";
console.log(+the_string);
// NaN

//Shuffle elements from array
var my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9];
console.log(my_list.sort(function() {
    return Math.random() - 0.5
}));
// [4, 8, 2, 9, 1, 3, 6, 5, 7]

//Flatten multidimensional array
var entries = [1, [2, 5], [6, 7], 9];
var flat_entries = [].concat(...entries);
// [1, 2, 5, 6, 7, 9]

// . Dynamic Property Names
const dynamic = 'flavour';
var item = {
    name: 'Coke',
    [dynamic]: 'Cherry'
}
console.log(item);
// { name: "Coke", flavour: "Cherry" }

//Use length to resize/empty an array
var entries = [1, 2, 3, 4, 5, 6, 7];
console.log(entries.length);
// 7
entries.length = 4;
console.log(entries.length);
// 4
console.log(entries);
// [1, 2, 3, 4]
