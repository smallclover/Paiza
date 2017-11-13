package com.smallclover.b;

import java.util.Scanner;

/**
 * 街の距離
 * @author smallclover
 * @create 2017-11-13
 * @since
 */
public class B046 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n_1 = sc.nextInt();
        String d_1 = sc.next();
        int n_2 = sc.nextInt();
        String d_2 = sc.next();

        if (d_2.equals(d_1)) {
            System.out.println(Math.abs(n_1 - n_2) * 100);
        }else if ((d_2.equals("N") && d_1.equals("S")) ||
                (d_2.equals("S") && d_1.equals("N")) ||
                (d_2.equals("W") && d_1.equals("E")) ||
                (d_2.equals("E") && d_1.equals("W"))) {
            System.out.println((n_1 + n_2) * 100);
        }else {
            System.out.println(Math.abs(n_1 -n_2) * 100 + Math.PI * 1.0/2.0 * 100 * (n_1 >= n_2? n_2: n_1));
        }
    }
}
