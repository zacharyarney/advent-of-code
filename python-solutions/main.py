import os
from day_1 import fuel_counter_upper
from day_4 import find_valid_passwords

base_dir = os.path.dirname(os.path.abspath(__file__))

def main():
    print('===Day 1===')
    print(fuel_counter_upper('%s/inputs/day1.txt' % base_dir)) 
    print('===Day 4===')
    print(find_valid_passwords(372304, 847060))


main()
