package aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DayThree {
    private Scanner scanner = new Scanner(new File("src/aoc/inputs/day3.txt"));
    private String[] input1 = scanner.nextLine().split(",");
    private String[] input2 = scanner.nextLine().split(",");
    private HashMap<String, Integer> path1;
    private HashMap<String, Integer> path2;

    public DayThree() throws FileNotFoundException {
    }

    public void printPath() {
        for (String thing : input1) {
            System.out.println(thing);
        }
    }
}

/*
* ALGORITHM
* Iterate through input1
* Determine direction via substring(0,1)
* if direction == U -> while i < distance (x, y++)
* if direction == D -> while i < distance (x, y--)
* if direction == R -> while i < distance (x++, y)
* if direction == L -> while i < distance (x--, y)
* */
