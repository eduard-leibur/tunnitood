from turtle import *

def puu(pikkus):
    if pikkus < 15:
        forward(pikkus)
        back(pikkus)
    else:
        forward(pikkus)
        left(45)
        puu(pikkus * 0.5)
        right(90)
        puu(pikkus * 0.5)
        left(45)
        back(pikkus)


left(90)
penup()
back(300)
pendown()
puu(300)
exitonclick()
