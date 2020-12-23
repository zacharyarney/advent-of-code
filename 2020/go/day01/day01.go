package day01

import (
	"bufio"
	"io"
	"log"
	"sort"
	"strconv"
)

// DayOne extends Day
type DayOnePtOne struct{}

// Challenge takes an io.Reader and returns the product of two numbers that have a sum of 2020
func (d DayOnePtOne) Challenge(file io.Reader) (int, error) {
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

// DayOnePtTwo implements Day
type DayOnePtTwo struct{}

// Challenge takes an io.Reader and returns the product of three numbers that have a sum of 2020
func (d DayOnePtTwo) Challenge(file io.Reader) (int, error) {
	var inputArr []int
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

		inputArr = append(inputArr, num)
	}

	sort.Ints(inputArr)

	for i, entry := range inputArr {
		j := i + 1
		k := len(inputArr) - 1

		for j < k {
			sum := entry + inputArr[j] + inputArr[k]

			if sum == 2020 {
				return entry * inputArr[j] * inputArr[k], err
			} else if sum < 2020 {
				j++
			} else {
				k--
			}
		}
	}

	return 0, err
}
