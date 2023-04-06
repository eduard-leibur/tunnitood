def vähim(järjend):
    if type(järjend[0]) == list:
        for element in järjend[0]:
            if element < järjend[0][0]:
                return element
            else:
                return järjend[0][0]
    elif type(järjend[1]) == list:
        for element in järjend[1]:
            if type(element) == list:
                element = vähim(element)
            if type(järjend[1][0]) == list:
                teine_element = vähim(järjend[1][0])
            else:
                teine_element = järjend[1][0]
            if element < teine_element:
                võrreldav = element
            else:
                võrreldav = järjend[1][0]
    else:
        võrreldav = järjend[1]

    if len(järjend) < 2:
        return järjend[0]
    else:
        if järjend[0] < võrreldav:
            if järjend[0] < vähim(järjend[1:]):
                return järjend[0]
            else:
                return vähim(järjend[1:])
        else:
            if võrreldav < vähim(järjend[1:]):
                return võrreldav
            else:
                return vähim(järjend[1:])


print(vähim([9, 0.5, 3, 1, 0.2]))
print(vähim([5, [8, 3],[[[[5, 1], 6]]], 7, 14]))
