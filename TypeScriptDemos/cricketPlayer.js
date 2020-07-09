"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.CricketPlayer = void 0;
var player_1 = require("./player");
var CricketPlayer = /** @class */ (function (_super) {
    __extends(CricketPlayer, _super);
    function CricketPlayer(id, name, team, coach) {
        var _this = _super.call(this, id, name) || this;
        _this.team = team;
        _this.coach = coach;
        return _this;
    }
    CricketPlayer.prototype.printPlayer = function () {
        console.log("id = " + _super.prototype.getId.call(this) + " name = " + _super.prototype.getName.call(this) + " team = " + this.team + " coach = " + this.coach.getName());
    };
    return CricketPlayer;
}(player_1.Player));
exports.CricketPlayer = CricketPlayer;
