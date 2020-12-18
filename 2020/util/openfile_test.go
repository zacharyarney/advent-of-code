package util

import (
	"bufio"
	"fmt"
	"io"
	"reflect"
	"testing"
)

type MockDay struct {
	Text string
}

func (m *MockDay) Challenge(file io.Reader) {
	scan := bufio.NewScanner(file)
	scan.Scan()
	m.Text = scan.Text()
	fmt.Println(m.Text)
	fmt.Println(scan.Text())
}

const testPath = "../inputs/test.txt"

func TestOpenAndUseFile(t *testing.T) {
	mockDay := &MockDay{}
	OpenAndUseFile(testPath, mockDay)
	want := "This is a test."

	if !reflect.DeepEqual(want, mockDay.Text) {
		t.Errorf("wanted text: %q got: %q", want, mockDay.Text)
	}
	// got := OpenAndUseFile("../inputs/test.txt")
	// want := "/Users/zacharyarney/projects/advent-of-code/2020/inputs/test.txt"

	// if got != want {
	// 	t.Errorf("got %q want %q\n", got, want)
	// }

	// fmt.Println(got)
}
