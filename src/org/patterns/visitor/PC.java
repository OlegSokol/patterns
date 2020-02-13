package org.patterns.visitor;

public class PC implements GamePlatform {

    @Override
    public void play() {
        System.out.println("40k and 1000000 fps");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPC();
    }
}
