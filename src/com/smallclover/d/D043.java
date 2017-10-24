package com.smallclover.d;

import java.util.Scanner;

/**
 * 天気の表示
 * @author smallclover
 * @create 2017-10-24
 * @since
 */
public class D043 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0 && n <= 30) {
            System.out.println("sunny");
        }else if(n >= 31 && n <= 70){
            System.out.println("cloudy");
        }else {
            System.out.println("rainy");
        }
    }
}
