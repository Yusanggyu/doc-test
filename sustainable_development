#!/usr/bin/env pybricks-micropython
from pybricks.hubs import EV3Brick
from pybricks.ev3devices import (Motor, TouchSensor, ColorSensor,
                                 InfraredSensor, UltrasonicSensor, GyroSensor)
from pybricks.parameters import Port, Stop, Direction, Button, Color
from pybricks.tools import wait, StopWatch, DataLog
from pybricks.robotics import DriveBase
from pybricks.media.ev3dev import SoundFile, ImageFile
from time import sleep

ev3 = EV3Brick()

motor_rail  = Motor(Port.A)
pl_motor    = Motor(Port.B)
c_motor     = Motor(Port.C)
pa_motor    = Motor(Port.D)

mot = [pl_motor, c_motor, pa_motor]
ti  = [4, 7, 10.5]  

def run_motor(motor):
    motor_rail.run(-100)
    sleep(ti[mot.index(motor)])
    motor_rail.stop()
    motor.run(-100)
    sleep(4.2)
    motor.run(100)
    sleep(4.2)
    motor.stop()

plastic = 0
can = 1
paper = 0

if plastic: run_motor(pl_motor)
elif can: run_motor(c_motor)
elif paper: run_motor(pa_motor)
else: motor_rail.run(-100)
