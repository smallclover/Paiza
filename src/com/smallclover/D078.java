package com.smallclover;

import java.util.Scanner;

/**
 * 入学試験
 * @author smallclover
 * @create 2017-10-17
 * @since
 */
public class D078 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        double [] lines={0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        double sum = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++){
            lines[i] = sc.nextDouble();
            sum += lines[i];
        }

        double pass = sc.nextDouble();
        avg = sum/7.0;

        if (avg >= pass){
            System.out.println("pass");
        }else {
            System.out.println("failure");
        }
    }
}
