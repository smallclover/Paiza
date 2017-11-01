package com.smallclover.c;

import java.util.Scanner;

/**
 * 野球の審判
 * @author smallclover
 * @create 2017-11-01
 * @since
 */
public class C033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] strs = new String [n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        }
        int ball_num = 0;
        int strike_num = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("ball")) {
                ball_num ++;
                if ((ball_num >= 1) && (ball_num <= 3)) {
                    System.out.println("ball!");
                }else if (ball_num == 4){
                    System.out.println("fourball!");
                }
            }else {
                strike_num ++;
                if ((strike_num >= 1) && (strike_num <= 2)) {
                    System.out.println("strike!");
                }else if (strike_num == 3){
                    System.out.println("out!");
                }
            }
        }
    }
}
