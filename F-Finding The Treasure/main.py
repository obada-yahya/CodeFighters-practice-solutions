x, y = map(int, input().split())
start_pos = []
finish_pos = []
for row in range(x):
    column = input().split()
    for cell in range(len(column)):
        if column[cell] == 'S':
            start_pos = [row, cell]
        elif column[cell] == 'X':
            finish_pos = [row, cell]

print(abs(start_pos[0] - finish_pos[0]) + abs(start_pos[1] - finish_pos[1]))
