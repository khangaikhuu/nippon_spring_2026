console.log('Hi');

// control flow

// Turing Complete Programming Language

// conditionals  - if/else if/else
// switch

// loop - for, while, do while

const age = 20;

if (age >= 18) {
    console.log('You are an adult');
} else if (age >= 13) {
    console.log('You are a teenager');
} else {
    console.log('You are a child');
}

// Switch
const day = "Tuesday";

switch (day) {
    case "Monday":
        console.log('Mon');
        break;
    case "Tuesday":
        console.log("Tue"); // this will print out on the console
        break;
    case "Wednesday":
        console.log("Wed");
        break;
    default:
        console.log('Other days');
}

// FOR loop
for (let i = 0; i < 10; i++){
	console.log(`The ${i+1} the element.`);
}

// 100 хүртэлх тооны зөвхөн 3-т хуваагддаг тоонуудыг хэвлэж харуул
for(let i = 0; i < 100; i++){
	if(i % 3 === 0){
		console.log(i);
	}
}

const numbers = [1, 4, 5, 6, 7, 10];

let i = 0;
while(i < numbers.length){
	console.log(`${i}-th index of element is ${numbers[i]}`);
	i++;
}

// do while
i = 0;

do {
	console.log(`${i}-th index of element is ${numbers[i]}`);
	i++;
} while(i < numbers.length);


// for ... of loop
let colors = ['red', 'blue', 'yellow'];

for(let color of colors){
	console.log(`Color is ${color}`);
}


