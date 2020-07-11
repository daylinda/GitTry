import {Player} from './player';
import { Coach } from './coach';
export class FootBallPlayer extends Player{
    team:string;
    coach: Coach ;
    constructor(id:number,name:string,team:string,coach:Coach){
        super(id,name);
        this.team=team;
        this.coach= new Coach(coach.id,coach.name);
    }

    printPlayer(){
        console.log("Printing player");
        
        super.printPlayer();
        console.log("team:"+this.team);
        console.log("coach name:"+this.coach.name);
    }
    
}