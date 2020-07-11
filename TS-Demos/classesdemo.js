"use strict";
exports.__esModule = true;
var footballplayer_1 = require("./footballplayer");
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
var h = new Hello("Hello all");
h.printMessage();
// let p =new Player(100,"Sachin");
// p.printPlayer();
// let p = new FootBallPlayer(100,"Dinesh","India");
// p.printPlayer();
var c = new coach_1.Coach(1, "billy");
var p = new footballplayer_1.FootBallPlayer(100, "sachin", "india", c);
p.printPlayer();
