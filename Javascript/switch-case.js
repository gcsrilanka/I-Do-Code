const x = new Date().getHours();

switch(true) {
  case (x >= 5 && x <= 11): //5am-11am
    console.log('Good morning!');
    break;

  case (x >= 12 && x <= 17): // 12pm-5pm
    console.log('Good afternoon!');
    break;

  case (x >= 18 && x <= 23): // 6pm-11pm
    console.log('Good evening!');
    break;

  default:
    console.log('A new day has just started.');

}