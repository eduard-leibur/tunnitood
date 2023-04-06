def vahemikus(järjend):
    if not järjend:
        return False
    elif järjend[0] > 0 and järjend[0] < 1:
        return järjend[0]
    else:
        return vahemikus(järjend[1:])


print(vahemikus((1.0, 0.7, 0.0, -0.9, 0.3)))
