"use strict";
exports.__esModule = true;
var requirement_1 = require("./requirement");
var testinterfaces_1 = require("./testinterfaces");
var i = new requirement_1.Implementor();
i.display();
i.requirement1();
var j = new testinterfaces_1.MyInterfaceImpl();
j.requirement1();
