package com.company;

import java.io.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2739 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for (int i=1; i<10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
