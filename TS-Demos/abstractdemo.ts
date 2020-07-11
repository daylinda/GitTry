import { Requirements, Implementor } from "./requirement";
import { MyInterface, MyInterfaceImpl } from "./testinterfaces";

let i:Requirements=new Implementor();
i.display();
i.requirement1();

let j:MyInterface = new MyInterfaceImpl();
j.requirement1();