package aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

enum Direction {
    U,
    D,
    R,
    L
}

public class DayThree {
    private String[] input1;
    private String[] input2;
    private HashMap<String, Boolean> path1;
    private int nearestX;
    private int nearestY;

    public DayThree(File input) throws FileNotFoundException {
        Scanner scanner = new Scanner(input);
        input1 = scanner.nextLine().split(",");
        input2 = scanner.nextLine().split(",");
        path1 = new HashMap<>();
        nearestX = 0;
        nearestY = 0;
        scanner.close();
    }

    public String[] getInput1() {
        return input1;
    }

    public String[] getInput2() {
        return input2;
    }

    public HashMap<String, Boolean> getPath1() {
        return path1;
    }

    public void createPath(String[] arr, HashMap<String, Boolean> hashMap) {
        int curX = 0;
        int curY = 0;

        for (String thing : arr) {
            Direction direction = Direction.valueOf(thing.substring(0, 1));
            int distance = Integer.parseInt(thing.substring(1));

            for (int i = distance; i > 0; i--) {
                switch (direction) {
                    case U:
                        curY++;
                        break;
                    case D:
                        curY--;
                        break;
                    case R:
                        curX++;
                        break;
                    case L:
                        curX--;
                        break;
                    default:
                        break;
                }
                hashMap.put(String.format("%d,%d", curX, curY), true);
            }
        }
    }

    public void checkForIntersections(String[] arr, HashMap<String, Boolean> hashMap) {
        int curX = 0;
        int curY = 0;
        boolean hashMapContainsKey;
        boolean coordinatesZero;
        boolean nearer;
        int manhattanDistance;

        for (String thing : arr) {
            Direction direction = Direction.valueOf(thing.substring(0, 1));
            int distance = Integer.parseInt(thing.substring(1));

            for (int i = distance; i > 0; i--) {
                switch (direction) {
                    case U:
                        curY++;
                        break;
                    case D:
                        curY--;
                        break;
                    case R:
                        curX++;
                        break;
                    case L:
                        curX--;
                        break;
                    default:
                        break;
                }
                hashMapContainsKey = hashMap.containsKey(String.format("%d,%d", curX, curY));
                coordinatesZero = nearestX == 0 && nearestY == 0;
                nearer = Math.abs(curX) + Math.abs(curY) < Math.abs(nearestX) + Math.abs(nearestY);

                if (hashMapContainsKey && (coordinatesZero || nearer)) {
                    nearestX = curX;
                    nearestY = curY;
                }
            }
        }
        manhattanDistance = Math.abs(nearestX) + Math.abs(nearestY);
        System.out.println("\n=== DAY 3.1 ===");
        System.out.println("MANHATTAN DISTANCE TO NEAREST INTERSECTION: " + manhattanDistance);
    }
}

/*
 * ALGORITHM
 * Iterate through input1
 * Determine direction via substring(0,1)
 * add coordinates to HashMap as string -> { "x,y": true }
 *   if direction == U -> while i < distance (x, y++)
 *   if direction == D -> while i < distance (x, y--)
 *   if direction == R -> while i < distance (x++, y)
 *   if direction == L -> while i < distance (x--, y)
 * ----
 * iterate through input2
 * convert items to coordinate strings
 * check path1 HashMap for coordinate string
 * if exists convert to integers and store coordinate as nearest intersection
 *   initialize nearest intersection var to {0, 0}
 *   if nearest == {0, 0} -> just replace it
 *   else check that coordinate absolute < nearest coordinate absolute
 * return nearest intersection
 * */
