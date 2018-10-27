//declare a function
function sayHello(){
    console.log("Hello");
}
//assign a function to variable
const saySomething = (something) => console.log(something);

//function can return with other function inside
function selectSayfunction(option){
    if(option == "hello"){
        return sayHello;
    }else if(option == "something"){
        return saySomething;
    }
}

//invoke a function
sayHello();
saySomething("Hacktoberfest");

//this will get a sayHellofunction
const selectedFunction = selectSayfunction("hello");
// invoke a sayHello function
selectedFunction();


