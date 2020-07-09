"use strict";
exports.__esModule = true;
exports.Player = void 0;
var Player = /** @class */ (function () {
    function Player(id, name) {
        this.id = id;
        this.name = name;
    }
    Player.prototype.getId = function () {
        return this.id;
    };
    Player.prototype.getName = function () {
        return this.name;
    };
    Player.prototype.printPlayer = function () {
        console.log("id = " + this.id + " name = " + this.name);
    };
    return Player;
}());
exports.Player = Player;
