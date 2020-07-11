export abstract class Requirements {
    
    display():void{
        console.log("Hello Abstract");
        
    }

    abstract requirement1();
}

export class Implementor implements Requirements{
    display(): void {
        console.log("implement");
        
    }

    
    requirement1(){
        console.log("inside requirements");
        
    }
}