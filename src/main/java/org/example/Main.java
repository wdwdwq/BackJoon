package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a == b &&  b == c){ //모든 변수가 다른 경우
            System.out.println(10000 + a * 1000);
        }
        else if( a == b || b == c || a == c){ // 두 개 변수가 같은경우
            if(a == b || a == c){ // a가 b 또는 c와 같은 경우
                System.out.println(1000 + a * 100);
            }else{//b가 c와 같은 경우
                System.out.println(1000 + b * 100);
            }
        }
        else{ //모든 변수가 다른 경우
            int max = Math.max(a,Math.max(b, c));
            System.out.println(max * 100);
        }
    }
}

//1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

//3개의 변수가 모두 다른, 아닌지 판단
//1.모든 변수가 같은 경우 10000 + a * 1000이 출력 (1,2,3 = 11000)
//2.변수 2개가 같은 경우 1000 + (같은 눈) * 100(1,1,3 = 1100)
//3.모든 변수가 다른 경우 max * 100 (1,2,3, = 300)