class Ravim:
    def __init__(self, nimi, kood, hind):
        self.nimi = str(nimi)
        self.kood = int(kood)
        self. hind = float(hind)
    
    def maksumus(self, ostukogus):
        return round(float(self.hind * int(ostukogus)), 2)
    
    def __str__(self):
        return self.nimi + " (" + str(self.kood) + ") " + str(self.hind)


class Retseptiravim(Ravim):
    def __init__(self, nimi, kood, hind, piirhind):
        super().__init__(nimi, kood, hind)
        self.piirhind = float(piirhind)
    
    def haigekassa_maksab(self):
        summa = (self.piirhind - 2.5) * 0.5
        return round(float(summa), 2)
    
    def maksumus(self, ostukogus):
        summa = float((self.hind - self.haigekassa_maksab()) * int(ostukogus))
        return round(summa, 2)
    
    def __str__(self):
        return self.nimi + " (" + str(self.kood) + ") " + str(round(self.hind - self.haigekassa_maksab(), 2))+ " (" + str(self.piirhind) + ")"


class Patsient:
    def __init__(self, nimi, isikukood, retseptid = {}):
        self.nimi = str(nimi)
        self.isikukood = int(isikukood)
        self.retseptid = retseptid
    
    def lisa_ravim(self, ravim: Ravim, kogus):
        self.retseptid[ravim] = int(kogus)
    
    def kuva_retseptid(self):
        return dict(self.retseptid)
    
    def osta_ravim(self, ravimi_nimi, kogus: int):
        if self.retseptid[ravimi_nimi] >= kogus:
            self.retseptid[ravimi_nimi] -= kogus
            print("Edukalt ostetud.")
        elif self.retseptid[ravimi_nimi] > 0:
            print("Retsepte on " + str(self.retseptid[ravimi_nimi]) + " tükki. Ei saa ostu sooritada.")
        else:
            print("Retseptid puuduvad. Ei saanud ostu sooritada.")


with open("ravimiteNimekiri.csv", encoding="UTF-8") as ravimite_fail:
    ravimid = []
    for rida in ravimite_fail:
        osad = rida.split(",")
        if osad[0] != "ravim":
            nimi = osad[0]
            kood = osad[1]
            hind = osad[4]
            piirhind = float(osad[5])
            if piirhind == 0:
                ravimid.append(Ravim(nimi, kood, hind))
            else:
                ravimid.append(Retseptiravim(nimi, kood, hind, piirhind))

with open("patsientideAndmed.csv", encoding="UTF-8") as patsientide_fail:
    kliendid = []
    for rida in patsientide_fail:
        osad = rida.split(",")
        if osad[0] != "nimi":
            nimi = osad[0]
            isikukood = osad[1]
            retseptid = osad[3].strip("\n")
            retseptide_sõnastik = {}
            if retseptid != "-":
                retseptid = retseptid.split(";")
                for retsept in retseptid:
                    retsepti_osad = retsept.split(":")
                    retsepti_nimi = retsepti_osad[0]
                    retsepti_kogus = retsepti_osad[1]
                    retseptide_sõnastik[retsepti_nimi] = int(retsepti_kogus)
            kliendid.append(Patsient(nimi, isikukood, retseptide_sõnastik))


# 1)
for patsient in kliendid:
    if patsient.nimi == "Paula Traavel":
        print(patsient.kuva_retseptid())

# 2)
for patsient in kliendid:
    if patsient.nimi == "Olle Oluver":
        ostusumma = 0
        for ravim in ravimid:
            if ravim.nimi == "decatylen":
                ostusumma += ravim.maksumus(1)
            elif ravim.nimi == "keto":
                ostusumma += ravim.maksumus(1)
        print("Olle ostusumma: " + str(round(ostusumma, 2)))

# 3)
for patsient in kliendid:
    if patsient.nimi == "Meevi Kospal":
        for ravim in ravimid:
            if ravim.nimi == "amoksiklav":
                ostetav_ravim = ravim
        for retsept in patsient.retseptid:
            if retsept == "amoksiklav":
                patsient.osta_ravim("amoksiklav", patsient.retseptid[retsept])
