package dayOne.puzzleOne;

import java.util.*;
import java.io.*;

public class DayOnePuzzleOne {
    public static int fuelCounterUpper(int mass) {
        return mass / 3 - 2;
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
