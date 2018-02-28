package ru.rtl.tasks.task2;

import ru.rtl.tasks.RunnableTask;

public class ArithmeticAverageMatrix extends RunnableTask {

    private int rows;
    private int cols;
    private int matrix[][];

    public ArithmeticAverageMatrix(int rows, int cols){
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Неверное использование конструктора.\n" +
                    "Значения для параметров 'rows' и 'cols' должны быть больше нуля.");
        }
        else{
            this.rows = rows;
            this.cols = cols;
        };
    }

    @Override
    public void runTask() {
        int sum = 0;
        for (int i = 0; i < rows - 1; i++) {

            for (int j = 0; j < cols - 1; j++) {
                sum += matrix[i][j];
                log(matrix[i][j] + " ");
            }

            logLine("");
        }

        logLine(sum / rows*cols);
    }

    @Override
    public void init() {

        int x[][] = new int[rows][cols];

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (i % 3 == 0){
                    x[i][j] = 100;
                }

                else if (j % 2 == 0){
                    x[i][j] = 200;
                }

                else{
                    x[i][j] = i * j;
                }
            }
        }
        this.matrix = x;
    }
}
