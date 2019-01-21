package com.tester;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of ticket:");
        int num = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int round = scanner.nextInt();
        Train pur = new Train(num,round);
        pur.print();

    }
}
