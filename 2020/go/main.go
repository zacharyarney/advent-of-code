package main

import (
	"fmt"

	"github.com/zacharyarney/advent-of-code/2020/go/day01"
	"github.com/zacharyarney/advent-of-code/2020/go/util"
)

func main() {
	fmt.Println("ADVENT OF CODE 2020")
	fmt.Println("Day One")
	dayOnePtOne := day01.DayOnePtOne{}
	dayOnePtTwo := day01.DayOnePtTwo{}
	fmt.Printf("Pt 1: %d\n", util.OpenAndUseFile("./inputs/day01.txt", dayOnePtOne))
	fmt.Printf("Pt 2: %d\n", util.OpenAndUseFile("./inputs/day01.txt", dayOnePtTwo))
}
