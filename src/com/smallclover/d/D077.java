package com.smallclover.d;

import java.util.Scanner;

/**
 * 計算機の表示
 * @author smallclover
 * @create 2017-10-17
 * @since
 */
public class D077 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 * num2;
        if(sum > 9999){
            System.out.println("NG");
        }else {
            System.out.println(sum);
        }
    }
}
