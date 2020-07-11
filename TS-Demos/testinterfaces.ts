import { Requirements, Implementor } from "./requirement";

export interface MyInterface {
    
    requirement1():void;
    requirement2():void;
    requirement3():void;
    requirement4():void;



}

export class MyInterfaceImpl implements MyInterface{
   
    requirement1(): void {
        console.log("req1")
    }
    requirement2(): void {
        console.log("req1")
    }
    requirement3(): void {
        console.log("req1")
    }
    requirement4(): void {
        console.log("req1")
    }


}