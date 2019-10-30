package org.firstinspires.ftc.teamcode;



public abstract class DriveTrain{

    abstract public void initMotors();

    abstract public void Drive(double forward, double right, double clockwise);

    abstract public void stop(boolean emergency);
}