package org.patterns.state;

public class StandState implements State {
    @Override
    public void pressPlay(Mp3PlayerContext context) {
        System.out.println("Stop playing state");
        context.setState(new StandState());
    }
}
