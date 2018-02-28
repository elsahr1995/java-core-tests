package ru.rtl.tasks.task3;

public class Circle implements AbstractShape {

    private double rad;
    private final double pi = Math.PI;

    public Circle (double rad){
        this.rad = rad;
    }

    @Override
    public double getSquareSize() {
        return pi * Math.pow(rad, 2);
    }

    @Override
    public double getSidesLength() {
        return 2 * pi * rad;
    }
}
