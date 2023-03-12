testcase = int(input())
for _ in range(testcase):
    n = int(input())
    values = map(int, input().split(" "))
    even = odd = 0
    for value in values:
        if value % 2 == 0: even += 1
        else: odd += 1
    print(even, odd)
