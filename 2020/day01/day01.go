package day01

import (
	"bufio"
	"io"
	"log"
	"strconv"
)

// ExpenseReport takes an io.Reader and returns the product of two numbers that have a sum of 2020
func ExpenseReport(file io.Reader) ([]int, error) {
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
