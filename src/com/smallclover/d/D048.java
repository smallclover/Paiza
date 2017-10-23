package com.smallclover.d;

import java.util.Scanner;

/**
 * 台風の間隔
 * @author smallclover
 * @create 2017-10-23
 * @since
 */
public class D048 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer [] nums = new Integer[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(nums[1] - nums[0]);
        System.out.println(nums[2] - nums[1]);
        System.out.println(nums[3] - nums[2]);
        System.out.println(nums[4] - nums[3]);
    }
}
