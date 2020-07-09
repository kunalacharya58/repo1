"use strict";
exports.__esModule = true;
exports.Coach = void 0;
var Coach = /** @class */ (function () {
    function Coach(name) {
        this.name = name;
    }
    Coach.prototype.getName = function () {
        return this.name;
    };
    Coach.prototype.printCoach = function () {
        console.log("Coach Name = " + this.name);
    };
    return Coach;
}());
exports.Coach = Coach;
