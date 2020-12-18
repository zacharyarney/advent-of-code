package day01

import (
	"fmt"
	"strings"
	"testing"
)

const testEntries = `1721
979
366
299
675
1456`

func TestExpenseReport(t *testing.T) {
	buffer := strings.NewReader(testEntries)
	// buffer.WriteString(testEntries)
	entries, err := ExpenseReport(buffer)

	if err != nil {
		t.Errorf("couldn't read file")
	}

	fmt.Println(entries)
}
