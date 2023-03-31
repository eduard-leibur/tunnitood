from turtle import *

def fraktal(pikkus, tase):
    if tase <= 0:
        right(90)
    else:
        for i in range(3):
            forward(pikkus)
            left(90)
            fraktal(pikkus * 0.5, tase - 1)
            right(90)
        forward(pikkus)
        right(180)


delay(0)
penup()
back(300)
left(90)
forward(300)
right(90)
pendown()

fraktal(100, 4)
exitonclick()
