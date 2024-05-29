package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        in.close();
        int sum = 0;

        for(int i = 1; i <= a; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 구하라
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//1부터 n까지 합을 출력