package ru.rtl.tasks.task1;

import ru.rtl.tasks.RunnableTask;

public class PizzaDecoratorPattern extends RunnableTask {
    public void runTask(){
        Pizza pizza = new SimpleNonVegeterianPizza();
        logLine("Описание пиццы: " + pizza.getDescription() + "\n" +
                "Цена пиццы: " + pizza.getPrice());

        pizza = new MeatPizzaDecorator(pizza);
        logLine("Описание пиццы: " + pizza.getDescription() + "\n" +
                "Цена пиццы: " + pizza.getPrice());

        pizza = new HamPizzaDecorator(pizza);
        logLine("Описание пиццы: " + pizza.getDescription() + "\n" +
                "Цена пиццы: " + pizza.getPrice());

    }
    public void init(){

    }
    public void run() {
        logTaskName();
        runTask();
    }
    public void logTaskName() {
        logLine(String.format(">>>>> Запуск примера: %s",
                this.getClass()));
    }
    public PizzaDecoratorPattern() {
        init();
    }
    public void log(Object message) {
        System.out.print(message);
    }
    public void logLine(Object message) {
        System.out.println(message);
    }
}
