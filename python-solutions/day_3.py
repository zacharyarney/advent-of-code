'''
ALGORITHM
Iterate through input1
Determine direction via substring(0,1)
add coordinates to HashMap as string -> { "x,y": true }
    if direction == U -> while i < distance (x, y++)
    if direction == D -> while i < distance (x, y--)
    if direction == R -> while i < distance (x++, y)
    if direction == L -> while i < distance (x--, y)
----
iterate through input2
convert items to coordinate strings
check path1 HashMap for coordinate string
if exists convert to integers and store coordinate as nearest intersection
    initialize nearest intersection var to {0, 0}
    if nearest == {0, 0} -> just replace it
    else check that coordinate absolute < nearest coordinate absolute
return nearest intersection
'''


def create_path(directions):
    coordinates = {}
    x = 0
    y = 0
    for waypoint in directions:
        direction = waypoint[0:1]
        distance = int(waypoint[1:])
        for i in range(distance):
            if direction == 'U':
                y += 1
            if direction == 'D':
                y -= 1
            if direction == 'R':
                x += 1
            if direction == 'L':
                x -= 1
            
            coordinates[f'{x}, {y}'] = True


def check_for_intersections(directions):
    pass


def find_closest_intersection(input):
    dirs = open(input)
    dir_list_1 = dirs.readline()[:-1].split(',')
    dir_list_2 = dirs.readline()[:-1].split(',')
    return (dir_list_1[len(dir_list_1) - 1], dir_list_2[len(dir_list_2) - 1][1:])
