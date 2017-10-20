package com.smallclover.d;

import java.util.Scanner;

/**
 * スイッチのオンオフ
 * @author smallclover
 * @create 2017-10-19
 * @since
 */
public class D067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String status_off = "OFF";
        String status_on = "ON";
        if (n == 0) {
            System.out.println(status_off);
        }else {
            if (n%2 == 0) {
                System.out.println(status_off);
            }else {
                System.out.println(status_on);
            }
        }
    }
}
