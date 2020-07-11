//var let const
/*
var global
let local
const local and non modifyable
*/
var x:number=10
function hello(){
    const m:number=100;
    var z:number=10000//remains local
    for(let i=0;i<10;i++){
        x=x+i;
    }
    if(m==100){
        console.log(z)
        
    }
    console.log("x = "+x);
    console.log("m "+m)//const is local scope
    console.log("z "+z);
}
console.log("x outside block "+x)
hello();

function looping(){
    const x:number=10
    var z:number=0
    
    while(z!=40){
        z=z+10
        // console.log(z);
    }
    console.log("z "+z);
    
    do{
        z=z+10
    }while(z!=50);
    console.log("z "+z);

    var y:number=2
    switch (y) {
        case 1:
            console.log("y "+y)
            break;
        
        case 2:
            console.log("y "+y)
            break;
    
        default:
            break;
    }

}

looping();
