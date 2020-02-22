def intcode_reader(input, noun=12, verb=2):
    arr = input.copy()
    arr[1] = noun
    arr[2] = verb

    for i in range(0, len(arr), 4):
        opcode = arr[i]
        arg_1 = arr[arr[i+1]]
        arg_2 = arr[arr[i+2]]

        if arr[i] == 1:
            arr[arr[i+3]] = arg_1 + arg_2
        elif arr[i] == 2:
            arr[arr[i+3]] = arg_1 * arg_2
        elif arr[i] == 99:
            return arr[0]
        else:
            return 'Something is wrong here...'


def find_input(input_arr, output):
    for i in range(len(input_arr)):
        for j in range(len(input_arr)):
            if intcode_reader(input_arr, i, j) == output:
                return f'INPUT CODE: {100 * i + j}'
