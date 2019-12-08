package aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class DayTwo {
    private Scanner scanner = new Scanner(new File("aoc/inputs/day2.txt"));
    private String input = scanner.nextLine();
    private int[] intCode = Stream.of(input.split(",")).mapToInt(Integer::parseInt).toArray();

    public DayTwo() throws FileNotFoundException {
    }

    public int[] getIntCode() {
        return intCode;
    }

    public void intCodeProgram(int[] intArr) {
        ArrayList<Integer> output = new ArrayList<>();

        intArr[1] = 12;
        intArr[2] = 2;

        for (int i : intArr) {
            output.add(i);
        }

        // Array solution for good measure
        for (int i = 0; i < intArr.length; i += 4) {
            int cur = intArr[i];

            if (cur == 1) {
                intArr[intArr[i + 3]] = intArr[intArr[i + 1]] + intArr[intArr[i + 2]];
            } else if (cur == 2) {
                intArr[intArr[i + 3]] = intArr[intArr[i + 1]] * intArr[intArr[i + 2]];
            } else if (cur == 99) {
                break;
            } else {
                System.out.println("ERROR: " + intArr[i] + " is not a valid opcode");
                break;
            }
        }

        // ArrayList solution
        for (int i = 0; i < output.size(); i += 4) {
            int cur = output.get(i);

            if (cur == 1) {
                output.set(output.get(i + 3), output.get(output.get(i + 1)) + output.get(output.get(i + 2)));
            } else if (cur == 2) {
                output.set(output.get(i + 3), output.get(output.get(i + 1)) * output.get(output.get(i + 2)));
            } else if (cur == 99) {
                break;
            } else {
                System.out.println("ERROR: " + output.get(i) + " is not a valid opcode");
                break;
            }
        }

        System.out.println("\n=== DAY 2.1 ===");
        System.out.println("~ Array Solution ~");
        System.out.println("OPCODE 0: " + intArr[0]);
        System.out.println("~ ArrayList Solution ~");
        System.out.println("OPCODE 0: " + output.get(0));
    }
}
