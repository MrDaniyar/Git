package ru.kpfu.npp.math;

/**
 * Created by Данияр on 15.03.14.
 */

public class RunnerClass {
    public static void main(String args[]){

        MatrixArrayImpI matrix;//объектная переменная
        matrix = new MatrixArrayImpI();//создали объект
        for (int i=0;i<30;i++){
            for (int j=0;j<30;j++){
                matrix.setValue(i,j,i+j);
            }
        }
        Object object= new Object();
        System.out.println(matrix);
    }
}
