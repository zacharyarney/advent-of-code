const readline = require('readline');
const fs = require('fs');

async function twoDArray(file) {
  const out = [];
  const lineReader = readline.createInterface({
    input: fs.createReadStream(file),
    crlfDelay: Infinity,
  });

  for await (const line of lineReader) {
    out.push(line.split(''));
  }

  return out;
}

module.exports = { twoDArray };
