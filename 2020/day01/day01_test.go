package day01

import (
	"strings"
	"testing"
)

const testEntries = `1721
979
366
299
675
1456`

func TestChallenge(t *testing.T) {
	buffer := strings.NewReader(testEntries)
	// buffer.WriteString(testEntries)
	dayOne := DayOne{}
	got, err := dayOne.Challenge(buffer)
	want := 514579

	if err != nil {
		t.Errorf("couldn't read file")
	}

	if got != want {
		t.Errorf("want %d got %d", want, got)
	}
}
