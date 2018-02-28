package ru.rtl.tasks.task1;

public class HamPizzaDecorator extends PizzaDecorator {

    public HamPizzaDecorator(Pizza pizzaToDecorate){
        super(pizzaToDecorate);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + Ветчина (45.90)";
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 45.90;
    }

}
