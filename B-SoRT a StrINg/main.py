string = input()
capitalLetters = [chr(i) for i in range(65, 91)]
smallLetters = [chr(i) for i in range(97, 123)]
charsTable = {}

# count sort solution o(n)
def solution():
    for i in string:
        if i in charsTable:
            charsTable[i] += 1
        else:
            charsTable[i] = 1

    for capitalLetter in capitalLetters:
        if capitalLetter in charsTable:
            for i in range(charsTable[capitalLetter]):
                print(capitalLetter, end="")

    for smallLetter in smallLetters:
        if smallLetter in charsTable:
            for i in range(charsTable[smallLetter]):
                print(smallLetter, end="")

# quick sort solution o(n log n)
def solution2():
    print("".join(sorted(string)))

solution2()
