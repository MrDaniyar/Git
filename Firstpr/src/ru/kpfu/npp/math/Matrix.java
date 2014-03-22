package ru.kpfu.npp.math;

/**
 * Created by Данияр on 15.03.14.
 */
public interface Matrix {
    int getValue(int row, int column);
    void setValue(int row, int column,int value);
    String toString();
}
