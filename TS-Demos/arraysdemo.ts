function testArray(){
    let fruits:Array<string>;
    fruits=['Apple','Orange','Strawberry']
    // fruits.forEach(element => {

    //     console.log(element)
        
    // });

    // let multi:(string|number)[]=['hey',1,2,44,'hello']
    // multi.forEach(element => {

    //     console.log(element)
        
    // });
        
    fruits.push("tomato")

    // fruits.pop()
    // fruits.reverse()   
    // fruits.sort()
    // console.log(fruits)
    console.log(fruits.indexOf("Strawberry"))
    fruits = fruits.concat(['mango','pineapple'])
    console.log(fruits)
    fruits.forEach(function  (n){
        console.log(n)
    })
    console.log(fruits.slice(1,3))
    
    console.log("after slice"+fruits);
    
    
    console.log(fruits.splice(1,3))//splice(position,how many elements from that position)

    console.log("after splice "+fruits)

    fruits.splice(fruits.indexOf("Strawberry"),1)

    console.log("after splice strawberry "+fruits)
    
    
}
testArray();

