package aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));
        DayOne dayOne = new DayOne();
        File f = new File("src/aoc/inputs/day1.txt");
        System.out.println("FILE EXISTS? " + f.exists());
        Scanner s = new Scanner(f);
        int sum = 0;
        int realSum = 0;

        System.out.println("===DAY 1.1===");

        while (s.hasNextInt()) {
            int mass = s.nextInt();

            sum += dayOne.fuelCounterUpper(mass);
            realSum += dayOne.fuelRequired(mass);
        }

        System.out.println("TOTAL FUEL REQUIREMENT: " + sum);
        System.out.println("\n===DAY 1.2===");
        System.out.println("ACTUAL TOTAL FUEL REQUIREMENT: " + realSum);
    }
}
