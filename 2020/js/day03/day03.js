function dayThreePtOne(arr, down, right) {
  let i = 0;
  let j = 0;
  let trees = 0;
  while (i < arr.length) {
    if (arr[i][j] === '#') {
      trees++;
    }

    if (j + right >= arr[i].length) {
      j -= arr[i].length;
    } else {
      i += down;
      j += right;
    }
  }

  return trees;
}

module.exports = { dayThreePtOne, dayThreePtTwo };
