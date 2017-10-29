package com.smallclover.c;

import java.util.Scanner;

/**
 * 手の組み合わせ
 * @author smallclover
 * @create 2017-10-29
 * @since
 */
public class C044 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] rock = new String [10];
        String[] scissors = new String [10];
        String[] paper = new String [10];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equals("rock")) {
                rock[i] = str;
            }else if(str.equals("scissors")){
                scissors[i] = str;
            }else {
                paper[i] = str;
            }
        }

        int  a = 0;
        int  b = 0;
        int  c = 0;

        for (int i = 0; i < 10; i++) {
            if ("rock".equals(rock[i])) {
                a++;
            }else if ("scissors".equals(scissors[i])){
                b++;
            }else if ("paper".equals(paper[i])){
                c++;
            }else {

            }
        }

        if (a == 0 && c != 0 && b != 0){
            System.out.println("scissors");
        }else if (b == 0 && a != 0 && c != 0){
            System.out.println("paper");
        }else if (c == 0 && b != 0 && a != 0){
            System.out.println("rock");
        }else {
            System.out.println("draw");
        }
    }
}
