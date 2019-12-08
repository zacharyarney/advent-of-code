package aoc;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));
        DayOne dayOne = new DayOne();
        DayTwo dayTwo = new DayTwo();

        dayOne.countUpFuel(dayOne.getScanner());
        dayTwo.intCodeProgram(dayTwo.getIntCode());
    }
}
