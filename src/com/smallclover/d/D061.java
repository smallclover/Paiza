package com.smallclover.d;

import java.util.Scanner;

/**
 * 3倍返し？
 * @author smallclover
 * @create 2017-10-20
 * @since
 */
public class D061 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println(1);
        }else {
            System.out.println(num * 3);
        }
    }
}
