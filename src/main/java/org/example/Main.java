package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = 0; // b와 일치할 시 갯수를 올리는 변수
        int N = Integer.parseInt(br.readLine()); // 배열의 길이를 설정
        int[] arr = new int[N]; // 배열 생성, 길이는 N만큼

        // 배열의 요소들을 입력받기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());; // 배열에 입력한 정수들 넣어주기
        }

        int b = Integer.parseInt(br.readLine()); // [문제] 입력 세번째 줄 정수

        // 배열을 순회하면서 변수 b와 같은 숫자 찾기
        for(int num : arr) {
            if(b == num) {
                count++;
            }
        }

        System.out.println(count);
    }
}


// 첫번째 줄에 배열의 길이를 설정
// 두번째 줄에 각 요소를 입력
// 세번째 줄에 입력한 숫자가 배열의 몇번 등장하는지 찾는다