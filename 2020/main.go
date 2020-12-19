package main

import (
	"fmt"

	"github.com/zacharyarney/advent-of-code/2020/day01"
	"github.com/zacharyarney/advent-of-code/2020/util"
)

func main() {
	fmt.Println("ADVENT OF CODE 2020")
	dayone := day01.DayOne{}
	fmt.Printf("DAY 01: %d\n", util.OpenAndUseFile("./inputs/day01.txt", dayone))
}
