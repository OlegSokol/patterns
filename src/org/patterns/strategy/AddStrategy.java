package org.patterns.strategy;

public class AddStrategy implements Strategy {
    @Override
    public void doAction(int i, int j) {
        System.out.println("Add = " + (i + j));
    }
}
