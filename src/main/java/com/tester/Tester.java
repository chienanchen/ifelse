package com.tester;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != -1){
            System.out.println("Please enter number of ticket:");
            num = scanner.nextInt();
            if (num == -1){
                System.out.println("Thank you!");
            } else {
                System.out.println("How many round-trip tickets:");
                int round = scanner.nextInt();
                Train pur = new Train(num, round);
                pur.print();

            }
        }



    }
}
