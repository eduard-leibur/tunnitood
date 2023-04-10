def esineb(väärtus, järjend):
    if not järjend:
        return False
    elif järjend[0] == väärtus:
        return True
    elif type(järjend[0]) == list:
        return esineb(väärtus, järjend[0])
    else:
        return esineb(väärtus, järjend[1:])


print(esineb(3, [1, 5, [2, 3], 5]))
