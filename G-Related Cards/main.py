n = int(input())
values = list(map(int, input().split(" ")))
values.sort()
ans = []
i = len(values) - 1
while i > 0:
    if values[i] != values[i - 1] + 1:
        ans.append(values[i])
    else:
        i -= 1
    i -= 1

if len(ans) == 1:
    ans.append(values[0])

print(ans[1], ans[0])