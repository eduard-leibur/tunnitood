def esineb_kordi(väärtus, järjend, mitu):
    if not järjend:
        return False
    elif väärtus == järjend[0]:
        mitu -= 1
    if mitu <= 0:
        return True
    else:
        return esineb_kordi(väärtus, järjend[1:], mitu)


print(esineb_kordi("b", ["a", "b", "a", "b", "b", "c"], 3))
