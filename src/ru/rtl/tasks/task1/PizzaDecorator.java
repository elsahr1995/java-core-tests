package ru.rtl.tasks.task1;

public abstract class PizzaDecorator implements Pizza {

    protected final Pizza pizzaToDecorate;

    public PizzaDecorator(Pizza pizzaToDecorate){
        this.pizzaToDecorate = pizzaToDecorate;
    }

    public String getDescription(){
        return pizzaToDecorate.getDescription();
    }
    public double getPrice(){
        return pizzaToDecorate.getPrice();
    }
}
