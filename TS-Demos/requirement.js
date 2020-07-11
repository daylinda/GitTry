"use strict";
exports.__esModule = true;
exports.Implementor = exports.Requirements = void 0;
var Requirements = /** @class */ (function () {
    function Requirements() {
    }
    Requirements.prototype.display = function () {
        console.log("Hello Abstract");
    };
    return Requirements;
}());
exports.Requirements = Requirements;
var Implementor = /** @class */ (function () {
    function Implementor() {
    }
    Implementor.prototype.display = function () {
        console.log("implement");
    };
    Implementor.prototype.requirement1 = function () {
        console.log("inside requirements");
    };
    return Implementor;
}());
exports.Implementor = Implementor;
