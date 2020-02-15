from math import floor


def fuel_counter_upper(input):
    modules = open(input).read().splitlines()
    # this one-liner is probably not great practice
    # but I know how to write a loop and this is for learning.
    total_fuel = sum(floor(int(m) / 3) - 2 for m in modules if int(m) > 0)

    return total_fuel
