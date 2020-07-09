console.log("Hello Typescript");
export var name:string;
let test:string;

function sayHello(name:string) {
	console.log("Hello, from "+name);
}
sayHello("Kunal");
sayHello("Harsh");

function add(a:number , b:number) {
	console.log("Addition: "+(a+b));
}
add(12,17);
add(23,78);

function sub(a:number , b:number) {
	console.log("Subtraction: "+(a-b));
}
sub(101,56);
sub(34,98);

function multiply(a:number, b:number) {
	return a*b;
}
console.log("Multiplication: "+multiply(12, 6));

var emp : {
	id:number;
	name:string;
}
emp = {
	id:100,
	name: "John"
}
console.log(emp);

// variable and loop
var x:number = 10;
function hello() {
	for (let i = 0; i < 10; i++) {
		x = x+i;
	}
	console.log("x = "+x);
}
// console.log(i);
console.log("x = "+x);
hello();
// const is non-modifiable and local scope;
// var is a normal variable and remains in its scope where it is defined, but is global to the block;
// let is purely a local variable;

var i = 10;
var t = 0;
do {
	t += i*i;
	i -= 1;
}while(i > 0);
console.log("t = "+t);

var a = [1,2,3,4,5];
var c = 0;
a.forEach(x => {
	c += x;
});
console.log("c = "+c);