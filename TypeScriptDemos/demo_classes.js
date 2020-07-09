"use strict";
exports.__esModule = true;
var player_1 = require("./player");
var cricketPlayer_1 = require("./cricketPlayer");
var coach_1 = require("./coach");
var Hello = /** @class */ (function () {
    function Hello(message) {
        this.message = message;
    }
    Hello.prototype.printMessage = function () {
        console.log(this.message);
    };
    return Hello;
}());
var h = new Hello("hello class");
h.printMessage();
var p = new player_1.Player(10, "Sachin");
p.printPlayer();
var cp = new cricketPlayer_1.CricketPlayer(18, "Kohli", "India", new coach_1.Coach("Garry"));
cp.printPlayer();
