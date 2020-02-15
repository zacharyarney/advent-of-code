from math import floor


def fuel_counter_upper(input):
    modules = open(input).read().splitlines()
    # Part 1
    # this one-liner is probably not great practice
    # but I know how to write a loop and this is for learning.
    total_fuel = sum(required_fuel(m) for m in modules if int(m) > 0)

    return total_fuel


def required_fuel(mass):
    req_fuel = floor(int(mass) / 3) - 2

    if req_fuel > 2:
        return req_fuel + required_fuel(req_fuel)
    elif req_fuel < 0:
        return 0
    else:
        return req_fuel
