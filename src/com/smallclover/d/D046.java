package com.smallclover.d;

import java.util.Scanner;

/**
 * 不思議なタマゴ
 * @author smallclover
 * @create 2017-10-23
 * @since
 */
public class D046 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] nums = new Integer[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n < nums[i]){
                n = nums[i];
            }
        }

        System.out.println(n);
    }
}
