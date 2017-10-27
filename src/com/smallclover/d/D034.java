package com.smallclover.d;

import java.util.Scanner;

/**
 * どれにしようかな
 * @author smallclover
 * @create 2017-10-27
 * @since
 */
public class D034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (21%a == 0) {
            System.out.println(a);
        }else {
            System.out.println(21%a);
        }
    }
}
