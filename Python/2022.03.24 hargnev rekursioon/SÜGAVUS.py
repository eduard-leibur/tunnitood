def sügavus(listide_list):
    sügavused = []
    if not listide_list:
        return 0
    for element in listide_list:
        if type(element) == list:   # isinstance(element, list)
            sügavused.append(sügavus(element))
        else:
            sügavused.append(1)
    return max(sügavused)


print(sügavus([[], [[[[]], []], []]]))
