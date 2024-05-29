package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int X = sc.nextInt();//총 금액
        int N = sc.nextInt();//종류 수
        int total = 0;

        for(int i = 0; i < N; i++){
            int a = sc.nextInt();//가격
            int b = sc.nextInt();//개수

            total += a * b;
        }
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

//구매한 각 물건의 가격과 개수
//구매한 물건들의 총 금액
//구매한 물건 가격 개수로 게산한 총 금액이 영수증에 적힌 총 금액과 일치하는지
//일치하면 Yes 불일치하면 No