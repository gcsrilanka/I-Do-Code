let x = Math.floor(Math.random() * 10) + 1; // Generates a random number between 1 and 10

for(i = 0; i <= 3; i++) {
    let input = prompt("Guess a number between 1 and 10");

    if(input == x) {
        alert(`Correct! The number was ${x}`);
        break;
    }
    else {
        if(i != 3){
            alert(`Wrong, ${3-i} more tries left.`);
        } else {
            alert(`No more tries left. The number was ${x}.`);
        }
    }
}