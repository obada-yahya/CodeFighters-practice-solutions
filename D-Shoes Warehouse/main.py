t = int(input())
brands = input().split()
n = int(input())
collection_of_shoes = input().split()

shoes_counter = dict()

for shoes in collection_of_shoes:
    shoes_counter[shoes] = shoes_counter.get(shoes, 0) + 1

keys = list(sorted(shoes_counter.keys()))
output1 = []
output2 = []
for key in keys:
    output1.append(key)
for key in keys:
    output2.append(str(shoes_counter[key]))

print(" ".join(output1))
print(" ".join(output2))