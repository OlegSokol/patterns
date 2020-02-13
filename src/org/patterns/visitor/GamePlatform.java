package org.patterns.visitor;

public interface GamePlatform {

    void play();

    void accept(Visitor visitor);
}
