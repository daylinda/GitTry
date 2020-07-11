console.log("hello world with ts")
export var name:string;


function sayHello(name){
    console.log("hello "+name);
}

function add(a:number,b:number){
    return a+b;
}

var res:number=add(100,20);
console.log("result is "+res);

sayHello("saiyaa");
sayHello("baiyya");

var emp:{
    id:number;
    name:string;
}

emp={
    id:100,
    name:"John"
}
console.log(emp);