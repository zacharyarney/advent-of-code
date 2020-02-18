def intcode_reader(input):
    input[1] = 12
    input[2] = 2

    for i in range(0, len(input), 4):
        opcode = input[i]
        arg_1 = input[input[i+1]]
        arg_2 = input[input[i+2]]

        if input[i] == 1:
            input[input[i+3]] = arg_1 + arg_2
        elif input[i] == 2:
            input[input[i+3]] = arg_1 * arg_2
        elif input[i] == 99:
            return input[0]
        else:
            return 'Something is wrong here...'
