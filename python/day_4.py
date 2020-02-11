def find_valid_passwords(start, end):
    for i in range(start, end):
        contains_same_adjacent = False
        increasing = True
        i_string = str(i)
        i_string_prev = None

        for digit in i_string:
            if i_string_prev is not None and int(digit) >= i_string_prev:
