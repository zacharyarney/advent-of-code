package util

import (
	"io"
	"log"
	"os"
	"path/filepath"
)

// Day is the type for each day's work. It has a Challenge method for the function used to solve the problem.
type Day interface {
	Challenge(io.Reader)
}

// OpenAndUseFile takes a path to a file as a string and returns and a Day struct and calls Day.Challenge()
func OpenAndUseFile(filePath string, day Day) {
	absPath, pathErr := filepath.Abs(filePath)
	if pathErr != nil {
		log.Fatal("couldn't get path")
	}

	file, fileErr := os.Open(absPath)
	if fileErr != nil {
		log.Fatal("couldn't get path")
	}

	day.Challenge(file)
}
