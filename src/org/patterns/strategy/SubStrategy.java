package org.patterns.strategy;

public class SubStrategy implements Strategy {
    @Override
    public void doAction(int i, int j) {
        System.out.println("Sub = " + (i - j));
    }
}
