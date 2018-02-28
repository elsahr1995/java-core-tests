package ru.rtl.tasks.task1;

public class MeatPizzaDecorator extends PizzaDecorator {

    public MeatPizzaDecorator(Pizza pizzaToDecorate) {
        super(pizzaToDecorate);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + Мясная добавка (50.99)";
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 50.99;
    }
}
