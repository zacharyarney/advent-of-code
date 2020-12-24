const { dayTwoPtOne, dayTwoPtTwo } = require('./day02/day02');
const { input1 } = require('./day02/input1');

function main() {
  console.log('ADVENT OF CODE 2020');
  console.log('Day One');
  console.log(`Part 1: ${dayTwoPtOne(input1)}`);
  console.log(`Part 2: ${dayTwoPtTwo(input1)}`);
}

main();
