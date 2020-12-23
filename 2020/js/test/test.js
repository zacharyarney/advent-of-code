export function it(description, fn) {
  try {
    fn();
    console.log(`${description} -- PASS`);
  } catch (err) {
    console.log(`${description} -- FAIL`);
    console.log(err);
  }
}
