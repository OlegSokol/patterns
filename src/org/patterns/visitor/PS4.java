package org.patterns.visitor;

public class PS4 implements GamePlatform {

    @Override
    public void play() {
        System.out.println("The best platform");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPS4();
    }
}
