package com.leejk.p03;

import java.util.Scanner;

public class Main {

    public static String solution(String str) {
        String[] split = str.split(" ");
        String result = "";
        for(String s : split) {
            if(s.length() > result.length()) result = s;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
