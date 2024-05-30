package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();

            int A = str.charAt(0) - 48 ; // charAt() 문자로 반환 -48(-0) 사용 문자의 아스키 코드 값을 반환함
            int B = str.charAt(2) - 48;

            if(A == 0 && B == 0){
                break;
            }
            sb.append((A+B)).append('\n');
        }
        System.out.println(sb);
    }
}

// 문제는 A+B를 출력하고 0, 0을 누르면 프로그램을 종료
// Exit 입력으로 프로그램 탈출
//