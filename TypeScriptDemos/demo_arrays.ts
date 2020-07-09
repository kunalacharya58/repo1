function testArrays() {
	let fruits:Array<string>;
	fruits = ["Apple", "Mango", "Pineapple", "Banana"];
	for (let i in fruits) {
		console.log(fruits[i]);
	}
	let multi:(string | number)[] = ["hey", 12, "forty", 45];
	for (let i in fruits) {
		console.log(multi[i]);
	}
	fruits.sort();
	console.log(fruits);
	
	console.log(fruits.push("DragonFruit"));
	console.log(fruits);
	console.log(fruits.pop());
	console.log(fruits);
}
testArrays();

// slice will offset
// splice will actually delete elements.
// splice(posiion, and how many to remoove)