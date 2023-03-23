def sügavus(listide_list):
    if not listide_list:
        return 0
    else:
        return 1 + sügavus(listide_list[1:])


# print(sügavus([[], [[[[]], []], []]]))
print(sügavus([[[]]]))
