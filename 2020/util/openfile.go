package util

import (
	"log"
	"path/filepath"
)

//OpenFile takes a path to a file as a string and returns
func OpenFile(filePath string) string {
	absPath, err := filepath.Abs(filePath)
	if err != nil {
		log.Fatal("couldn't open file")
	}

	return absPath
}
