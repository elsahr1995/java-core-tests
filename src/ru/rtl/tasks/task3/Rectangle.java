package ru.rtl.tasks.task3;

public class Rectangle implements AbstractShape {

    private double length;
    private double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSquareSize() {
        return length * width;
    }

    @Override
    public double getSidesLength() {
        return 2 * (length + width);
    }
}
