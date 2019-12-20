package aoc;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));
        DayOne dayOne = new DayOne(new File("src/aoc/inputs/day1.txt"));
        DayTwo dayTwo = new DayTwo(new File("src/aoc/inputs/day2.txt"));
        DayThree dayThree = new DayThree(new File("src/aoc/inputs/day3.txt"));

        // *** DAY ONE ***
        dayOne.countUpFuel(dayOne.getScanner());

        // *** DAY TWO ***
        dayTwo.intCodeProgram(dayTwo.getIntCode());
        dayTwo.determineCorrectInputs(dayTwo.getIntCode(), 19690720);
    }
}
