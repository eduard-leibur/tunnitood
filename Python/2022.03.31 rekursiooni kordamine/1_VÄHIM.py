def vähim(järjend):
    if len(järjend) < 2:
        return järjend[0]
    else:
        if järjend[0] < järjend[1]:
            if järjend[0] < vähim(järjend[1:]):
                return järjend[0]
            else:
                return vähim(järjend[1:])
        else:
            if järjend[1] < vähim(järjend[1:]):
                return järjend[1]
            else:
                return vähim(järjend[1:])


print(vähim([9, 0.5, 3, 1, 0.2]))
