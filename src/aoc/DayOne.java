package aoc;

public class DayOne {
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

}
