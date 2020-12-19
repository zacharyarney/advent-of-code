package util

import (
	"bufio"
	"io"
	"log"
	"reflect"
	"strconv"
	"testing"
)

type MockDay struct {
}

func (m MockDay) Challenge(file io.Reader) (int, error) {
	scan := bufio.NewScanner(file)
	scan.Scan()
	out, err := strconv.Atoi(scan.Text())
	if err != nil {
		log.Fatal(err)
	}
	return out, err
}

const testPath = "../inputs/test.txt"

func TestOpenAndUseFile(t *testing.T) {
	mockDay := MockDay{}
	got := OpenAndUseFile(testPath, mockDay)
	want := 2020

	if !reflect.DeepEqual(want, got) {
		t.Errorf("wanted text: %q got: %d", want, got)
	}
	// got := OpenAndUseFile("../inputs/test.txt")
	// want := "/Users/zacharyarney/projects/advent-of-code/2020/inputs/test.txt"

	// if got != want {
	// 	t.Errorf("got %q want %q\n", got, want)
	// }

	// fmt.Println(got)
}
