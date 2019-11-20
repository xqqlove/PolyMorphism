package com.creditease.music;

public class BobImpl implements Bob1 ,Bob2 {
    @Override
    public void bob(){
        Bob2.super.bob();
    }

    public static void main(String[] args) {
        BobImpl bob=new BobImpl();
        bob.bob();
    }
}
