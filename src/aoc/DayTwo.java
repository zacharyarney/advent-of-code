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
        System.out.println("\n=== DAY 2.1 ===");
        System.out.println("~ Array Solution ~");
        System.out.println("OPCODE 0: " + intCodeProgram(intArr.clone(), 12, 2));

        intCodeProgram(intArr.clone(), 12, 2);
    }

    public int intCodeProgram(int[] intArr, int noun, int verb) {
        intArr[1] = noun;
        intArr[2] = verb;

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

        return intArr[0];
    }

    public void determineCorrectInputs(int[] arr, int output) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (intCodeProgram(arr.clone(), i, j) == output) {
                    System.out.println("\n=== DAY 2.2 ===");
                    System.out.println("PROGRAM CODE: " + (100 * i + j));
                    return;
                }
            }
        }
    }

    // 2.1 ArrayList solution
    public int intCodeProgramAL(int[] intArr) {
        ArrayList<Integer> output = new ArrayList<>();
        int[] arrCopy = intArr.clone();

        arrCopy[1] = 12;
        arrCopy[2] = 2;

        for (int i : arrCopy) {
            output.add(i);
        }

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

        System.out.println("~ ArrayList Solution ~");
        System.out.println("OPCODE 0: " + output.get(0));

        return output.get(0);
    }
}
