"use strict";
exports.__esModule = true;
exports.name = void 0;
console.log("Hello Typescript");
var test;
function sayHello(name) {
    console.log("Hello, from " + name);
}
sayHello("Kunal");
sayHello("Harsh");
function add(a, b) {
    console.log("Addition: " + (a + b));
}
add(12, 17);
add(23, 78);
function sub(a, b) {
    console.log("Subtraction: " + (a - b));
}
sub(101, 56);
sub(34, 98);
function multiply(a, b) {
    return a * b;
}
console.log("Multiplication: " + multiply(12, 6));
var emp;
emp = {
    id: 100,
    name: "John"
};
console.log(emp);
// variable and loop
var x = 10;
function hello() {
    for (var i_1 = 0; i_1 < 10; i_1++) {
        x = x + i_1;
    }
    console.log("x = " + x);
}
// console.log(i);
console.log("x = " + x);
hello();
// const is non-modifiable and local scope;
// var is a normal variable and remains in its scope where it is defined, but is global to the block;
// let is purely a local variable;
var i = 10;
var t = 0;
do {
    t += i * i;
    i -= 1;
} while (i > 0);
console.log("t = " + t);
var a = [1, 2, 3, 4, 5];
var c = 0;
a.forEach(function (x) {
    c += x;
});
console.log("c = " + c);
