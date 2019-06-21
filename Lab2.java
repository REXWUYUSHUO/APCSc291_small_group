package com.company;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        int n;//number of students
        int count = 0;//count each one visited students
        int[] f = new int[50001], v = new int[50001];
        System.out.println("How many students?");

        n = STUDENTIN_SCANNER.nextInt();
        for(int i = 0; i < n; i++) {
            f[i] = STUDENTIN_SCANNER.nextInt();//best friend
            v[i] = 0;//visited
        }

        for(int i = 0; i < n; i++) {
            if(v[i] == 0) {
                if(f[i] == i) {
                    count++;
                    v[i] = 1;
                } else {
                    v[i] = 1;
                    int next = f[i];
                    while(v[next] == 0) {
                        v[next] = 1;
                        next = f[next];
                    }
                    count++;
                }
            }
        }
        System.out.println("How many groups are there?");
        System.out.print(count);

    }

    public final static Scanner STUDENTIN_SCANNER = new Scanner(System.in);
}