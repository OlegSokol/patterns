package org.patterns.visitor;

public class PlatformAnalyzerVisitor implements Visitor {

    @Override
    public void visitPS4() {
        System.out.println("Fucking awesome!");
    }

    @Override
    public void visitXboxOne() {
        System.out.println("Where my fucking exclusives?");
    }

    @Override
    public void visitPC() {
        System.out.println("I have titan9000 but 3 fps and no games. Anyway consoles sucks.");
    }
}
