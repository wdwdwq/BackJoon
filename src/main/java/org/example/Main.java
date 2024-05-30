package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String input = in.nextLine();

            if (input.equals("Exit")) {
                in.close();
                System.exit(0);
            }
            String[] parts = input.split(" ");

            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            System.out.println(A + B);
        }

    }
}

// 문제는 A+B를 출력하고 0, 0을 누르면 프로그램을 종료
// Exit 입력으로 프로그램 탈출