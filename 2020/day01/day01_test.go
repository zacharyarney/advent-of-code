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
	t.Run("Two numbers", func(t *testing.T) {
		buffer := strings.NewReader(testEntries)
		dayOne := DayOnePtOne{}
		got, err := dayOne.Challenge(buffer)
		want := 514579

		if err != nil {
			t.Errorf("couldn't read file")
		}

		if got != want {
			t.Errorf("want %d got %d", want, got)
		}
	})

	t.Run("Three numbers", func(t *testing.T) {
		buffer := strings.NewReader(testEntries)
		dayOne := DayOnePtTwo{}
		got, err := dayOne.Challenge(buffer)
		want := 241861950

		if err != nil {
			t.Errorf("couldn't read file")
		}

		if got != want {
			t.Errorf("want %d got %d", want, got)
		}
	})
}
