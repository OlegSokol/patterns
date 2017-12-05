package org.patterns.strategy;

public class DemoStrategyPattern {
    public static void main(String[] args) {
        Context subContext = new Context(new SubStrategy());
        subContext.executeStrategy(2, 2);

        Context addContext = new Context(new AddStrategy());
        addContext.executeStrategy(2, 2);
    }
}
