const assert = require('assert').strict;
const path = require('path');
const { itAsync } = require('../test/test');
const { twoDArray } = require('../util/read');
const { dayThreePtOne, dayThreePtTwo } = require('./day03');

const file = path.resolve(__dirname, 'testInput.txt');

itAsync('dayThreePtOne returns 7', async () => {
  const down = 1;
  const right = 3;
  const input = await twoDArray(file);
  const got = dayThreePtOne(input, down, right);
  const want = 7;
  assert.strictEqual(got, want);
});

itAsync('dayThreePtTwo returns 336', async () => {
  const pathArr = [
    [1, 1],
    [1, 3],
    [1, 5],
    [1, 7],
    [2, 1],
  ];
  const input = await twoDArray(file);
  const got = dayThreePtTwo(input, pathArr);
  const want = 336;
  assert.strictEqual(got, want);
});
