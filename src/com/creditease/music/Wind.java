package com.creditease.music;

public class Wind extends Instrument {
    @Override
    public void play(Note n){
        System.out.println("wind play "+n);
    }
}
