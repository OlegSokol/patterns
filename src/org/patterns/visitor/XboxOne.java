package org.patterns.visitor;

public class XboxOne implements GamePlatform {

    @Override
    public void play() {
        System.out.println("Where my exclusives?");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitXboxOne();
    }
}
