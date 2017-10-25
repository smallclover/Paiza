package com.smallclover.d;

import java.util.Scanner;

/**
 * 本棚選び
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D041 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] n = new Integer[3];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        if (n[1]*n[2] > n[0]) {
            System.out.println("OK");
        }else {
            System.out.println("NG");
        }
    }
}
