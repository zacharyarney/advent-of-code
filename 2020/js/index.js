const path = require('path');
const { twoDArray } = require('./util/read');
const { dayTwoPtOne, dayTwoPtTwo } = require('./day02/day02');
const { input1 } = require('./day02/input1');
const { dayThreePtOne, dayThreePtTwo } = require('./day03/day03');
const dayThreeInputOnePath = path.resolve(
  __dirname,
  'day03/dayThreeInputOne.txt'
);
const dayThreePtTwoPathArr = [
  [1, 1],
  [1, 3],
  [1, 5],
  [1, 7],
  [2, 1],
];

async function main() {
  console.log('ADVENT OF CODE 2020');
  console.log('Day Two');
  console.log('\tPart 1: ', dayTwoPtOne(input1));
  console.log('\tPart 2: ', dayTwoPtTwo(input1));
  console.log('Day Three');
  const dayThreeInputOne = await twoDArray(dayThreeInputOnePath);
  console.log('\tPart 1: ', dayThreePtOne(dayThreeInputOne, 1, 3));
  console.log('\tPart 2: ', dayThreePtTwo(dayThreeInputOne, dayThreePtTwoPathArr));
}

main();
