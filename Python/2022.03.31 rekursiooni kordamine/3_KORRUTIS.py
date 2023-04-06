def korrutis(järjend):
    if not järjend:
        return 1
    elif type(järjend[0]) == list:
        return korrutis(järjend[0]) * korrutis(järjend[1:])
    else:
        return järjend[0] * korrutis(järjend[1:])


print(korrutis([5,[8,3],[[[[5,1],6]]],7,14]))
