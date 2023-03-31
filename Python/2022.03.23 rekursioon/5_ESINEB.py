def esineb(väärtus, järjend):
    if not järjend: return False
    elif järjend[0] == väärtus: return True
    else: return esineb(väärtus, järjend[1:])


print(esineb("a", ["b", "b", "c", "a", "d"]))
