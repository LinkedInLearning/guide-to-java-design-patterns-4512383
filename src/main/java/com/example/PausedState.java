package com.example;

public class PausedState implements PlayerState {

    @Override
    public void pressButton(MediaPlayer player) {
        player.play();
        player.setState(new PlayingState());
    }

}
