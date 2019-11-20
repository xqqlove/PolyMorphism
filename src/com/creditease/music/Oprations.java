package com.creditease.music;

public interface Oprations {
    void execute();
    static void show(String s){
        System.out.println(s);
    }
    static void runOps(Oprations ...opp){
        for(Oprations o:opp){
            o.execute();
        }
    }
}
