from turtle import *

def fraktal(pikkus, tase):
    if tase <= 0:
        forward(pikkus)
        back(pikkus)
    else:
        forward(pikkus)
        left(90)
        fraktal(pikkus * 0.6, tase - 1)
        right(180)
        fraktal(pikkus * 0.6, tase - 1)
        left(90)
        back(pikkus)


left(90)
penup()
back(200)
pendown()

fraktal(200, 5)
exitonclick()
