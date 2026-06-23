console.log('Array of Javascript');

const fruits = ['Apple', 'Banana', 'Grape'];
console.log(fruits);

const scores = [85, 90, 78, 92];
console.log(scores);

const mixed = ["Betty", 20, true, null, undefined, [1, 2]];
console.log(mixed);

// index of array
console.log(fruits[0]); // Apple
console.log(fruits[1]); // Banana
console.log(fruits[2]); // Grape

console.log(fruits.length); // 3

fruits.push('Cherry'); 
console.log(fruits); // ['Apple', 'Banana', 'Grape', 'Cherry']

fruits.pop(); 
console.log(fruits); // ['Apple', 'Banana', 'Grape']

console.log(scores.indexOf(90)); // 1

