console.log('Javascript Functions');

// Javascript Interpreter
/// Орчуулагч

//alert("This is alert");
// Browser API

const result = prompt("What is your name");

// code 
// function declaration - parameter
function greet(name) {
    return `Hello, my name is ${name}`;
}


// function call = argument
console.log(greet(result));
// khangai -> Hello, my name is khangai

function add(a, b) {
    return a + b;
}

console.log(add(5, 6));


function introduce(name, age) {
    console.log(`My name is ${name} and i'm ${age} years old`);
}

introduce("Khangaikhuu", 44);

function printSum(a, b) {
    console.log(a + b);
}

const printSumResult = printSum(5, 6);
console.log(printSumResult); // undefined

// function expression - anonymous function
const minus = function(a, b) {
    return a - b;
}
console.log(minus(10, 5)); // 5

// arrow function expression - суман функц
const subtract = (a, b) => {
    return a - b;
}
console.log(subtract(10, 6)); // 4
/**
 * Exercises
 * 
 * function declaration - divide, multiply функцүүд бичээд тест оруулна уу
 * 
 * function expression - power гэдэг функц бичиж тест оруулна уу
 * 
 * arrow function expression - circle area олдог функц бичээд тест оруулна уу
 */

// Object Literal
console.log("=====================");
console.log("Object Literal");
// object literal
// name, age => keys
// Sarah, 20 => values
// Javascript object notation
const student = {
    name: "Sarah",
    age: 20
};

console.log(student);

const mixedObject = {
    name: "Dog",
    gender: 'male',
    age: 5,
    isBig: false,
    weight: 5.6,
    kids: ["Shiro", "Kuro", "Ao", "Aka"]
}

console.log(mixedObject);
// dot notation
console.log(mixedObject.age);

const complicateObject = {
	"high-grade": 95,
	"low-grade":  45
}
// bracket notation
console.log(complicateObject["high-grade"]);


mixedObject.name = "Cat";

// high-grade = 85
complicateObject["high-grade"] = 85;
console.log(complicateObject);

const funcObject = {
	name: "Bird",
	color: "Black",
	say: function(){
		console.log("Guag Guag");
	}
}
funcObject.say();

// difference of function expression VS function declaration

printMe();

function printMe(){
	console.log("Hello");
}


printMe();

//console.log(a);
const a = 6;


const printMeFunc = function(){
	console.log("hello");
}

printMeFunc();

