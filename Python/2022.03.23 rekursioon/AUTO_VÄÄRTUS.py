def auto_hind(algväärtus, aastad):
    if aastad == 0:
        return round(algväärtus, 2)
    else:
        return round(auto_hind(algväärtus * 0.8, aastad - 1), 2)


print(auto_hind(10000.0, 5))
