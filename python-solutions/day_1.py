from math import floor


def fuel_counter_upper(input):
    modules = open(input).read().splitlines()
    total_fuel = sum(floor(int(mod) / 3) -
                     2 for mod in modules if int(mod) > 0)

    return total_fuel
