// querySelector ашиглан
// бүх товчнуудыг js дээрээ оруулан 
// хувьсагчуудад хадгална уу

const buttonSeven = document.querySelector('#seven');
const buttons = document.querySelectorAll("button");
console.log(buttons);

const one= buttons[8];
const two = buttons[9];
const three = buttons[10];
const four = buttons[4];
const five=buttons[5];
const six = buttons[6];
const zero = buttons[12];
const seven = buttons[0];
const eight = buttons[1];
const nine = buttons[2];
const plus = buttons[15];
const multiply = buttons[3];
const subtract = buttons[11];
const divide = buttons[7];
const equal = buttons[14];
const dot = buttons[13];

// output
const output = document.querySelector("#output");

let outputString = "";
let isSecond = false;
let first = '';
let second = '';
// add event listener function

seven.addEventListener('click', function(){
    console.log('button seven clicked');
    outputString += 7;
    output.textContent = outputString;
});

one.addEventListener('click', function(){
    outputString += 1;
    output.textContent = outputString;
});

plus.addEventListener('click', function(){
    console.log('button plus clicked');
    first = output.textContent;
    isSecond= true;
    if(isSecond){
        output.textContent = '';
        outputString = '';
    } else {
        second = output.textContent;
        const result = first + second;
        output.textContent = result;
    }
});



two.addEventListener('click', function(){
    console.log('button two clicked');
});

three.addEventListener('click', function(){
    console.log('button three clicked');
});

four.addEventListener('click', function(){
    console.log('button four clicked');
});

five.addEventListener('click', function(){
    console.log('button five clicked');
});

six.addEventListener('click', function(){
    console.log('button six clicked');
});

eight.addEventListener('click', function(){
    console.log('button eight clicked');
});

nine.addEventListener('click', function(){
    console.log('button nine clicked');
});

zero.addEventListener('click', function(){
    console.log('button seven clicked');
});



subtract.addEventListener('click', function(){
    console.log('button subtract clicked');
});

multiply.addEventListener('click', function(){
    console.log('button multiply clicked');
});

divide.addEventListener('click', function(){
    console.log('button division clicked');
});

seven.addEventListener('click', function(){
    console.log('button seven clicked');
});

dot.addEventListener('click', function(){
    console.log('button dot clicked');
});

equal.addEventListener('click', function(){
    console.log('button seven clicked');
});
