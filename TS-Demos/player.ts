export class Player{
    id:number;
    name:string;
    constructor(id:number,name:string){
        this.id=id;
        this.name=name;
    }
    printPlayer(){
        console.log("id:"+this.id+" name:"+this.name);
        
    }
    
   
}