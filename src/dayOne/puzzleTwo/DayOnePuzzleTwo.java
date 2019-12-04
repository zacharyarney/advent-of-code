package dayOne.puzzleTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOnePuzzleTwo {
    public static int fuelCounterUpper(int mass) {
        int required = mass / 3 - 2;

        if (required < 3 && required > 0) {
            return required;
        } else if (required < 0) {
            return 0;
        } else {
            return required + fuelCounterUpper(required);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("dayOne/day-one-input.txt"));
        int sum = 0;

        while (s.hasNextInt()) {
            sum += fuelCounterUpper(s.nextInt());
        }

        System.out.println("TOTAL FUEL REQUIREMENT: " + sum);
    }
}
