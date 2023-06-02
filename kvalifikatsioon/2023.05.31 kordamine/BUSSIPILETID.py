class Sõidukaart:
    def __init__(self, kasutajanimi, isikukood, pileti_nr):
        self.kasutajanimi = str(kasutajanimi)
        self.isikukood = int(isikukood)
        self.pileti_nr = int(pileti_nr)

    def sõida(self, kilometraaž):
        hind = kilometraaž * 0.15
        if hind > 1:
            return round(hind, 2)
        else:
            return 1

    def __str__(self):
        return "Kasutaja: " + self.kasutajanimi +\
                "\nIsikukood: " + str(self.isikukood) +\
                "\nPileti nr: " + str(self.pileti_nr)


class Õpilaspilet(Sõidukaart):
    def __init__(self, kasutajanimi, isikukood, pileti_nr, kool, klassinr):
        super().__init__(kasutajanimi, isikukood, pileti_nr)
        self.kool = str(kool)
        self.klassinr = str(klassinr)

    def sõida(self, kilometraaž):
        hind = kilometraaž * 0.1
        if hind > 0.75:
            return round(hind, 2)
        else:
            return 0.75

    def __str__(self):
        return super().__str__() +\
            "\nKool: " + self.kool +\
            "\nKlassinumber: " + self.klassinr


class Pensionär(Sõidukaart):
    def __init__(self, kasutajanimi, isikukood, pileti_nr):
        super().__init__(kasutajanimi, isikukood, pileti_nr)

    def sõida(self, kilometraaž):
        hind = kilometraaž * 0.12
        if hind > 1:
            return round(hind, 2)
        else:
            return 1


mihkel = Õpilaspilet("Mihkel", 512, 112, "NRG", "12B")
paavo = Pensionär("Mihkel", 621959, 112)
tiina = Sõidukaart("Mihkel", 125125, 112)
print(mihkel.__str__())
print(mihkel.sõida(25))
print(paavo.__str__())
print(paavo.sõida(24))
