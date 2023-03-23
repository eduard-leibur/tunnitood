def sõne_pikkus(sõne):
    if sõne == "":
        return 0
    else:
        return 1 + sõne_pikkus(sõne[1:])


print(sõne_pikkus("aabits"))
