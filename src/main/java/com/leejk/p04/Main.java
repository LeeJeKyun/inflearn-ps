package com.leejk.p04;

import java.util.Scanner;

public class Main {

    public static String[] solution(int num, String[] str) {
        for(int i=0; i<num; i++) {
            String s = str[i];
            String res = "";
            for(int j=0; j<s.length(); j++) {
                res += s.charAt(s.length()-j-1);
            }
            str[i] = res;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for(int i=0; i<num; i++ ) {
            str[i] = sc.next();
        }

        for(String x : solution(num, str)){
            System.out.println(x);
        }
    }
}
