package com.creditease.music;

public class Im implements Ins {

    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        Ins ins=new Im();
        ins.firstMethod();
        ins.secondMethod();
        ins.newMethod();
    }

}
