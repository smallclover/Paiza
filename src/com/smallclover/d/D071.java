package com.smallclover.d;

import java.util.Scanner;

/**
 * 洗濯物と砂ぼこり
 * @author smallclover
 * @create 2017-10-18
 * @since
 */
public class D071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double m = sc.nextDouble();
        if ((t >= 25 || m <= 40 ) && !(t >= 25 && m <= 40)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
