package com.creditease.music;

public interface Ins {
    void firstMethod();
    void secondMethod();
    default void newMethod(){
        System.out.println("newMethod");
    }
}
