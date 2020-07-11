"use strict";
exports.__esModule = true;
exports.Coach = void 0;
var Coach = /** @class */ (function () {
    function Coach(id, name) {
        this.id = id;
        this.name = name;
    }
    Coach.prototype.printCoach = function () {
        console.log("id:" + this.id + " name:" + this.name);
    };
    return Coach;
}());
exports.Coach = Coach;
