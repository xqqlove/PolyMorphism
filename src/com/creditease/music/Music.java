package com.creditease.music;

public class Music {
    public static void run(Instrument i){
        i.play(Note.A);
    }

    public static void main(String[] args) {
        Instrument i=new Wind();
        Instrument i1=new Instrument();
        Music.run(i);
        Music.run(i1);
    }
}
