class Rong:
    def __init__(self, pikkus, kaal, max_kiirus, nimi = ""):
        self.nimi = str(nimi)
        self.pikkus = float(pikkus)
        self.kaal = int(kaal)
        self.max_kiirus = int(max_kiirus)
    
    def aeg(self, vahemaa_asulates: float, vahemaa_asulaväliselt: float):
        aeg_asulates = float(vahemaa_asulates / 50)
        if self.max_kiirus >= 140:
            kiirus_asulaväliselt = 140
        else:
            kiirus_asulaväliselt = self.max_kiirus
        aeg_asulaväliselt = float(vahemaa_asulaväliselt / kiirus_asulaväliselt)
        return float(aeg_asulates + aeg_asulaväliselt)
    
    def __str__(self):
        return "Rong " + self.nimi +\
            " pikkusega " + str(self.pikkus) +\
            " ja kaaluga " + str(self.kaal) +\
            " sõidab maksimaalselt " + str(self.max_kiirus)


class Reisirong(Rong):
    def __init__(self, pikkus, kaal, max_kiirus, istekohti, seisukohti, nimi = ""):
        super().__init__(pikkus, kaal, max_kiirus, nimi = "")
        self.istekohti = int(istekohti)
        self.seisukohti = int(seisukohti)
    
    def reisijate_arv(self):
        return self.istekohti + self.seisukohti
    
    def __str__(self):
        return super().__str__() + " ning mahutab " + str(self.reisijate_arv) + " reisijat"


tem_18 = Rong(16.9, 126, 100, "TEM-18")
orle = Reisirong(57.7, 130, 160, 188, 160, "Orle")
põlve = Reisirong(74.3, 176, 160, 214, 211, "Põlve")
tep_70 = Rong(21.7, 135, 160, "TEP-70")
cme_3 = Rong(17.2, 123, 95, "CME-3")
krull = Reisirong(45.5, 124, 160, 105, 99, "Krull")
te116 = Rong(18.15, 138, 100, "2TE116")
kõu = Reisirong(75, 159, 160, 262, 222, "Kõu")
rongid = [tem_18, orle, põlve, tep_70, cme_3, krull, te116, kõu]

# 1)
print(str(tep_70.pikkus))
# 2)
print(str(kõu.istekohti))
# 3)
print(str(krull.reisijate_arv()))
# 4)
print(str(len(rongid)) + " paari rööpaid")
# 5)
kiireim = rongid[0]
for rong in rongid:
    if type(rong) == Rong:
        if rong.aeg(20, 150) < kiireim.aeg(20, 150):
            kiireim = rong
print(kiireim.nimi)
# 6)
reisijaid = 0
for rong in rongid:
    if type(rong) == Reisirong:
        reisijaid += rong.reisijate_arv()
print(str(reisijaid) + " reisijat")