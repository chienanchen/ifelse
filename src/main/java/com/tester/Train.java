package com.tester;

public class Train {
    int num;
    int round;
    int total;


    public Train(int num, int round) {
        this.num = num;
        this.round = round;

    }
    public void print(){
        this.total= (num-round)*1000+(round*1800);
        System.out.println("Total ticker:"+num);
        System.out.println("Round trip:"+round);
        System.out.println("Total:"+total);
    }
}
