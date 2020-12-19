package day01

import (
	"bufio"
	"io"
	"log"
	"strconv"
)

// DayOne extends Day
type DayOne struct{}

	var inputArr []int
	scan := bufio.NewScanner(file)
	err := scan.Err()

	if err != nil {
		log.Fatal(err)
	}

	for scan.Scan() {
		num, err := strconv.Atoi(scan.Text())
		if err != nil {
			log.Fatal(err)
		}

		inputArr = append(inputArr, num)
	}

	return inputArr, err
}
