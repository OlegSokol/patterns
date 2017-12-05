package org.patterns.state;

public class PlayState implements State {
    @Override
    public void pressPlay(Mp3PlayerContext context) {
        System.out.println("Start paying state");
        context.setState(new PlayState());
    }
}
