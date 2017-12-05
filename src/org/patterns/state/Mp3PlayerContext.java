package org.patterns.state;

public class Mp3PlayerContext {
    private State state;

    public Mp3PlayerContext(State state) {
        this.state = state;
    }

    public void playBitton() {
        state.pressPlay(this);
    }

    public State getState() {
        return state;
    }

    public Mp3PlayerContext setState(State state) {
        this.state = state;
        return this;
    }
}
