package day01

import (
	"bufio"
	"io"
	"log"
	"strconv"
)

// DayOne extends Day
type DayOne struct{}

// Challenge takes an io.Reader and returns the product of two numbers that have a sum of 2020
func (d DayOne) Challenge(file io.Reader) (int, error) {
	var inputArr []int
	var min int
	var max int
	var output int
	scan := bufio.NewScanner(file)
	err := scan.Err()

	if err != nil {
		log.Fatal(err)
	}
	// scan file to []int
	for scan.Scan() {
		num, err := strconv.Atoi(scan.Text())
		if err != nil {
			log.Fatal(err)
		}
		// store min value
		if len(inputArr) == 0 || num < min {
			min = num
		}
		// store max value
		if len(inputArr) == 0 || num > max {
			max = num
		}

		inputArr = append(inputArr, num)
	}

	for i, entry := range inputArr {
		dif := 2020 - entry
		if dif == min {
			output = entry * min
		}

		if dif == max {
			output = entry * max
		}

		if dif < max || dif > min {
			for j, adder := range inputArr {
				if j == i {
					continue
				}
				if adder == dif {
					output = entry * adder
				}
			}
		}
	}

	return output, err
}
