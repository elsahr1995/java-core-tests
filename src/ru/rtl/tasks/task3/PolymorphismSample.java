package ru.rtl.tasks.task3;

import ru.rtl.tasks.RunnableTask;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismSample extends RunnableTask {

    @Override
    public void runTask() {

        List<AbstractShape> abstractShapeList = new ArrayList<AbstractShape>();

        abstractShapeList.add(new Circle(4.52));
        abstractShapeList.add(new Rectangle(6,3));
        abstractShapeList.add(new Circle(7.33));
        abstractShapeList.add(new Rectangle(4,7));

        for (AbstractShape figure : abstractShapeList){
            logLine(this);
            logLine(figure.getSquareSize());
            logLine(figure.getSidesLength());
        }
    }

    @Override
    public void init() {

    }
}
