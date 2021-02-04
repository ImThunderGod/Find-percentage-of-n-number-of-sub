package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int n;
        n = sc.nextInt();
        int marks[] = new int[n];
        int sum = 0;
        float percentage;
        System.out.println("Enter marks");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] <= 100) {
                sum = sum + marks[i];
            } else {
                System.out.println("Invalid");
            }
        }
        int v = n * 100;
        System.out.println("Total marks is: " + sum);
        percentage = sum * 100 / v;
        System.out.println("Percentage is : " + percentage);
    }
}
