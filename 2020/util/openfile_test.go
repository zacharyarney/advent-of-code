package util

import (
	"fmt"
	"testing"
)

func TestOpenFile(t *testing.T) {
	got := OpenFile("../inputs/test.txt")
	want := "/Users/zacharyarney/projects/advent-of-code/2020/inputs/test.txt"

	if got != want {
		t.Errorf("got %q want %q\n", got, want)
	}

	fmt.Println(got)
}
