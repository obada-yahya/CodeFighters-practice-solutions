n = int(input())
characters = input().split()
positions = list(map(int, input().split()))
output = ['0'] * n
for i in range(len(positions)):
    output[positions[i] - 1] = characters[i]

print("".join(output))
