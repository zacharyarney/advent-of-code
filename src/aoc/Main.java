package aoc;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));
        DayOne dayOne = new DayOne(new File("aoc/inputs/day1.txt"));

        dayOne.countUpFuel(dayOne.getScanner());
    }
}
