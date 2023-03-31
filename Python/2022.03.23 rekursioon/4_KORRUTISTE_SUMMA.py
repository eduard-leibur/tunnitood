def korrutsite_summa(järjend):
    if not järjend:
        return 1
    elif len(järjend) == 1:
        return järjend[0]
    else:
        return järjend[0] * järjend[-1] + korrutsite_summa(järjend[1:-1])


print(korrutsite_summa([1, 2, 3, 4, 5]))
