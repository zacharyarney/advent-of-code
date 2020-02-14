def find_valid_passwords(start, end):
    count = 0

    for i in range(start, end):
        contains_adjacent_pair = False
        increasing = True
        i_string = str(i)
        i_string_prev = None
        current_run = None
        pair = False

        for digit in i_string:
            int_digit = int(digit)
            if i_string_prev is not None and int_digit != i_string_prev:
                if current_run is not None and pair is True:
                    contains_adjacent_pair = True
                    current_run = None
                if int_digit < i_string_prev:
                    increasing = False

            if i_string_prev is not None and int_digit == i_string_prev:
                if int_digit == current_run:
                    pair = False
                else:
                    pair = True

                current_run = int_digit

            i_string_prev = int_digit

        if pair:
            contains_adjacent_pair = True

        if increasing and contains_adjacent_pair:
            count += 1

    return count
