package com.smallclover;

import java.util.Scanner;

/**
 * @author smallclover
 * @create 2017-10-17
 * @since
 * 時間の表記
 */
public class D074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        System.out.println(time%24);
    }
}
