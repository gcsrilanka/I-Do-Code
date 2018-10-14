let color = "gray";

// Randome number from 0 to 5
const random  = Math.floor(Math.random() * 6);

switch(random) {
  case 0: 
    color = "red";
    break
    
  case 1: 
     color = "blue";
     break;
     
  case 2: 
     color = "green";
     break;
     
  case 3: 
     color = "yellow";
     break;
     
  case 4: 
     color = "orange";
     break;
     
  default: 
     color = "purple";
     break;
}

// A bad poem
console.log(`Roses are ${color}, and so are you!`)
