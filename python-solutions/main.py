import os
import sys
from inputs import day2
from day_1 import fuel_counter_upper
from day_2 import intcode_reader
from day_4 import find_valid_passwords
sys.path.insert(0, os.path.abspath(
    os.path.join(os.path.dirname(__file__), '..')))

base_dir = os.path.dirname(os.path.abspath(__file__))
day_1_input = '%s/inputs/day1.txt' % base_dir


def main():
    print('===Day 1===')
    print(fuel_counter_upper(day_1_input))
    print('===Day 2===')
    print(intcode_reader(day2.input))
    print('===Day 4===')
    print(find_valid_passwords(372304, 847060))


main()
