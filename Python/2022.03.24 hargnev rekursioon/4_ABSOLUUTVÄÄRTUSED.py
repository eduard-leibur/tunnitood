def rek_abs(järjend):
    tulemus = []
    for element in järjend:
        if type(element) == int or type(element) == float:
            tulemus.append(abs(element))
        elif type(element) == list:
            tulemus.append(rek_abs(element))
    return tulemus


print(rek_abs([2, -6, [8, -12, -12, [4, [-6], -3]], 7, [3.55, -3.55]]))
