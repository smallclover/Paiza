package com.smallclover.d;

import java.util.Scanner;

/**
 * 同じ文字
 * @author smallclover
 * @create 2017-10-27
 * @since
 */
public class D079 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] chr = str.toCharArray();
        int correct = 0;
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == chr[0]) {
                correct++;
            }
        }

        if (correct == chr.length) {
            System.out.println("NG");
        }else {
            System.out.println("OK");
        }
    }
}
