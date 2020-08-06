"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(brand, name, seats, type, color) {
        this.id = ++Car.ID;
        this.brand = brand;
        this.name = name;
        this.seats = seats;
        this.type = type;
        this.color = color;
    }
    Car.ID = 0;
    return Car;
}());
exports.Car = Car;
