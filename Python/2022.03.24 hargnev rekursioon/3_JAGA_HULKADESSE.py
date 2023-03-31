def jaga(järjend):
    b = []
    c = []
    if not järjend:
        return [b, c]
    elif len(järjend) == 1:
        b.append(järjend[0])
        return [b, c]
    elif len(järjend) == 2:
        b.append(järjend[0])
        c.append(järjend[1])
        return [b, c]
    else:
        b.append(järjend[0])
        c.append(järjend[1])
        b += jaga(järjend[2:])[0]
        c += jaga(järjend[2:])[1]
        return [b, c]


print(jaga([1, 2, 3, 4, 5, 6, 7]))
