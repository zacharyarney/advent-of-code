function it(description, fn) {
  try {
    fn();
    console.log(`PASS -- ${description}`);
  } catch (err) {
    console.log(`FAIL -- ${description}`);
    console.log(err);
  }
}

async function itAsync(description, fn) {
  try {
    await fn();
    console.log(`PASS -- ${description}`);
  } catch (err) {
    console.log(`FAIL -- ${description}`);
    console.log(err);
  }
}

module.exports = { it, itAsync };
