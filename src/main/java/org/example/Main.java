package org.example;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //N은 입력 받을 줄의 개수

        StringTokenizer st ;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }
        br.close();

        bw.flush(); // 한 번에 값을 출력할 때 사용
        bw.close();
    }
}

// 별 찍기 반대로
