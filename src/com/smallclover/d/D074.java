package com.smallclover.d;

import java.util.Scanner;

/**
 * 時間の表記
 * @author smallclover
 * @create 2017-10-17
 * @since
 */
public class D074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        System.out.println(time%24);
    }
}
