def fibonacci(arv):
    if arv == 0:
        return 0
    elif arv == 1:
        return 1
    else:
        f_arv = fibonacci(arv - 1) + fibonacci(arv - 2)
        return f_arv


print(fibonacci(19))
