package com.leejk.p01;

import java.util.Scanner;

public class Main {

    public static int solution(String str, char c) {
        String lowerCase = str.toLowerCase();
        c = Character.toLowerCase(c);
        int result = 0;
        for(int i=0; i<lowerCase.length(); i++) {
            if(lowerCase.charAt(i) == c) result++;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int result = solution(str, c);
        System.out.println(result);

    }
}