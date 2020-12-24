function dayTwoPtOne(arr) {
  let validPasswords = 0;

  arr.forEach(pw => {
    let i = 0;

    while (pw.charAt(i) !== ' ') {
      i++;
    }

    const rule = pw.charAt(i + 1);
    const password = pw.slice(i + 4).split('');
    const min = parseInt(pw.slice(0, 2));
    const max =
      pw.charAt(2) === '-'
        ? parseInt(pw.slice(3, 5))
        : parseInt(pw.slice(2, 4));
    let count = 0;

    password.forEach(char => {
      if (char === rule) {
        count++;
      }
    });

    if (count >= min && count <= max) {
      validPasswords++;
    }
  });

  return validPasswords;
}

function dayTwoPtTwo(arr) {
}

module.exports = { dayTwoPtOne, dayTwoPtTwo };
