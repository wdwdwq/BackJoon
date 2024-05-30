package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){

            int A = in.nextInt();
            int B = in.nextInt();

            if(A == 0 && B == 0){
                in.close();
                break;
            }
            System.out.println(A+B);
        }

    }
}
// 문제는 A+B를 출력하고 0, 0을 누르면 프로그램을 종료
