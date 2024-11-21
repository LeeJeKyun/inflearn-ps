package com.leejk.p02;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : charArray) {
            if(Character.isUpperCase(c)) {
                char lowerCase = Character.toLowerCase(c);
                sb.append(lowerCase);
            } else if(Character.isLowerCase(c)) {
                char upperCase = Character.toUpperCase(c);
                sb.append(upperCase);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
