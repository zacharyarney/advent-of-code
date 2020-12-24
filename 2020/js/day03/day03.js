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

function dayThreePtTwo(arr, pathArr) {
  let out = 0;
  pathArr.forEach((path) => {
    const trees = dayThreePtOne(arr, path[0], path[1])
    if (!out) {
      out = trees;
    } else {
      out *= trees;
    }
  })

  return out;
}

module.exports = { dayThreePtOne, dayThreePtTwo };
