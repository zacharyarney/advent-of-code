const assert = require('assert').strict;
const { it } = require('../test/test');
const { dayTwoPtOne, dayTwoPtTwo } = require('./day02');

const inputOne = ['1-3 a: abcde', '1-3 b: cdefg', '2-9 c: ccccccccc'];

dayTwoPtTwo(inputOne);

it('dayOnePtOne should return 2', () => {
  const got = dayTwoPtOne(inputOne);
  const want = 2;
  assert.strictEqual(got, want);
});
