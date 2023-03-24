def sügavus(listide_list):
    sügavusi = 0
    for element in listide_list:
        if type(element) == list:
            sügavusi += 1 + sügavus(element)
        else:
            return
    return sügavusi


print(sügavus([[], [[[[]], []], []]]))
