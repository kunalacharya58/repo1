function testArrays() {
    var fruits;
    fruits = ["Apple", "Mango", "Pineapple", "Banana"];
    for (var i in fruits) {
        console.log(fruits[i]);
    }
    var multi = ["hey", 12, "forty", 45];
    for (var i in fruits) {
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
