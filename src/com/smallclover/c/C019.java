package com.smallclover.c;

import java.util.Scanner;

/**
 * 完全数とほぼ完全数
 * @author smallclover
 * @create 2017-11-05
 * @since
 */
public class C019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nativeNum = new Integer[n];
        for (int i = 0; i < nativeNum.length; i++) {
            nativeNum[i] = sc.nextInt();
        }

        for (int i = 0; i < nativeNum.length; i++) {
            int sum = 1;
            for (int j = 2; j < nativeNum[i]; j++) {
                if (nativeNum[i]%j == 0) {
                    sum +=j;
                }
            }
            if (sum == nativeNum[i]) {
                System.out.println("perfect");
                continue;
            }

            if (Math.abs(nativeNum[i] - sum) == 1) {
                System.out.println("nearly");
            }else {
                System.out.println("neither");
            }
        }
    }
}
