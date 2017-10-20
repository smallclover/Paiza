package com.smallclover.d;

import java.util.Scanner;

/**
 * 割り切れない平均点
 * @author smallclover
 * @create 2017-10-19
 * @since
 */
public class D069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double [] array = new Double[7];
        Double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
            sum += array[i];
        }
        //
        System.out.println(String.format("%.1f", sum/7.0));
    }
}
