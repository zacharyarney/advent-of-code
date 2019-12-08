package aoc;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));
        DayOne dayOne = new DayOne();
        DayTwo dayTwo = new DayTwo();

        // *** DAY ONE ***
        dayOne.countUpFuel(dayOne.getScanner());

        // *** DAY TWO ***
        dayTwo.intCodeProgram(dayTwo.getIntCode());
        dayTwo.determineCorrectInputs(dayTwo.getIntCode(), 19690720);
    }
}
