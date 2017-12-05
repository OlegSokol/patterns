package org.patterns.state;

public class DemoStatePattern {
    public static void main(String[] args) {
        Mp3PlayerContext context = new Mp3PlayerContext(new PlayState());
        context.playBitton();

        StandState standState = new StandState();
        standState.pressPlay(context);

        PlayState playState = new PlayState();
        playState.pressPlay(context);
    }
}
