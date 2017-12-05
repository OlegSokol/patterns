package org.patterns.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int i, int j) {
        strategy.doAction(i, j);
    }
}
