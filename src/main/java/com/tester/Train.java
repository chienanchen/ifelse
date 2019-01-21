package com.tester;

public class Train {
    int num;
    int round;
    int tot;

    public Purchase(int num, int round) {
        this.num = num;
        this.round = round;
        this.tot= (num-round)*1000+(round*1800);
    }
    public void print(){
        System.out.println("Total ticker:"+num);
        System.out.println("Round trip:"+round);
        System.out.println("Total:"+tot);

    }
}
