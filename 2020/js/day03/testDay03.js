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
