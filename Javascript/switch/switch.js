var maxBottles = 99;

function countBottlesOnWall(currentBottles, maxBottle){

  switch(currentBottles) {
      case 0:
          console.log('No more bottles of beer on the wall, no more bottles of beer.\n' +
          'Go to the store and buy some more, ' + maxBottle + ' bottles of beer on the wall.\n\n');
          break;
      case 1:
          console.log(currentBottles + ' bottle of beer on the wall, ' + currentBottles +
          '  bottle of beer.\n Take one down, pass it around, no more bottles of beer on the wall...\n\n');
          countBottlesOnWall(currentBottles-1,maxBottles);
          break;
      default:
          console.log(currentBottles + ' bottles of beer on the wall, ' + currentBottles +
          '  bottles of beer.\n Take one down, pass it around, ' + (currentBottles - 1) +
          ' bottles of beer on the wall...\n\n');
          countBottlesOnWall(currentBottles-1,maxBottles);
  }
}

countBottlesOnWall(maxBottles,maxBottles);
