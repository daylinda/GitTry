import {Player} from './player';
import { FootBallPlayer } from './footballplayer';
import { Coach } from './coach';
class Hello{
    message:string;
    constructor(message){
        this.message=message;
    }

    printMessage(){
        console.log(this.message);
    }

}
let h =new Hello("Hello all");
h.printMessage();

// let p =new Player(100,"Sachin");
// p.printPlayer();

// let p = new FootBallPlayer(100,"Dinesh","India");
// p.printPlayer();
let c = new Coach(1,"billy")
let p = new FootBallPlayer(100,"sachin","india",c)
p.printPlayer();