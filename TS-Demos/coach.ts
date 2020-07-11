export class Coach {
    id:number;
    name:string;
    constructor(id:number,name:string) {
        this.id=id;
        this.name=name;
    }
    printCoach(){
        console.log("id:"+this.id+" name:"+this.name);
        
    }
}