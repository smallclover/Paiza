package com.smallclover.d;

import java.util.Scanner;

/**
 * カウントダウン
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
