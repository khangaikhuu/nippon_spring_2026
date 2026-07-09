/// 
const course = "Java Fullstack";

function printCourse() {
    console.log(course);
}

printCourse(); // Java Fullstack


// function scope
function makeMessage(name) {
    const message = `Hello, ${name}`;
    // local scope
    return message;
}

// console.log(message);

// global scope
const message = "Secret";

function printMessage() {
    console.log(message);
}

console.log(message);

// block scope
if (true) {
    const status = "inside block";
    let count = 1;
}

// console.log(status);

// arrow function
const double = (number) => {
    return number * 2;
}

console.log(double(4)); // 8

const doubleImplicit = number => number * 2

console.log(doubleImplicit(4)); // 8

const add = (a, b) => a + b;
console.log(add(5, 10)); // 15

const createStudent = (name, score) => ({ name, score });
console.log(createStudent("Khangaikhuu", 100)); // {name: 'Khangaikhuu', score: 100}

// Array methods
// map method
const studentNames = ["Dorjoo", "Saraa", "Boldoo"];
const upperNames = studentNames.map(s => s.toUpperCase());
console.log(upperNames); // ['DORJOO', 'SARAA', 'BOLDOO']
// [null, "DORJOO", "SARA"]


// filter method
const scores = [55, 80, 92, 40];
const passingScores = scores.filter(score => score >= 60);
console.log(passingScores); //[80, 92]

// reduce method
let sumScores = 0;

for (let s of scores) {
    sumScores += s;
}
console.log(sumScores); // 267

const total = scores.reduce((sum, score) => sum + score, 0);
console.log(total); // 267




