package aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOne {
    private int sum = 0;
    private int realSum = 0;
    private Scanner scanner = new Scanner(new File("src/aoc/inputs/day1.txt"));

    public DayOne() throws FileNotFoundException {
    }

    public Scanner getScanner() {
        return scanner;
    }

    public int fuelCounterUpper(int mass) {
        return mass / 3 - 2;
    }

    public int fuelRequired(int mass) {
        int required = fuelCounterUpper(mass);

        if (required < 3 && required > 0) {
            return required;
        } else if (required < 0) {
            return 0;
        } else {
            return required + fuelRequired(required);
        }
    }

    public void countUpFuel(Scanner s) {
        while (s.hasNextInt()) {
            int mass = s.nextInt();

            sum += fuelCounterUpper(mass);
            realSum += fuelRequired(mass);
        }

        System.out.println("=== DAY 1.1 ===");
        System.out.println("TOTAL FUEL REQUIREMENT: " + sum);
        System.out.println("\n=== DAY 1.2 ===");
        System.out.println("ACTUAL TOTAL FUEL REQUIREMENT: " + realSum);
    }
}
