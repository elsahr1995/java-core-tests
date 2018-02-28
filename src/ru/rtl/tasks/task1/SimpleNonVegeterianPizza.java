package ru.rtl.tasks.task1;

public class SimpleNonVegeterianPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Простая невегетерианская пицца";
    }

    @Override
    public double getPrice() {
        return 730;
    }
}
