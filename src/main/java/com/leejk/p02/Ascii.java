package com.leejk.p02;

import java.util.Scanner;

public class Ascii {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if (c>=97 && c<=122) sb.append((char)(c-32));
            else if (c>=65 && c<=90) sb.append((char)(c+32));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}