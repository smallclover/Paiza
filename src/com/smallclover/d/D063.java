package com.smallclover.d;

import java.util.Scanner;

/**
 * お花見の場所取り
 * @author smallclover
 * @create 2017-10-20
 * @since
 */
public class D063 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer [] nums = new Integer[6];
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (i == 5){
                n = nums[5];
            }
        }
        bubbleSort(nums);
        for (int i = 0; i < nums.length; i++){
            if(n == nums[i]){
                System.out.println(i + 1);
            }
        }
    }

    /**
     * 冒泡排序
     * @param numbers
     */
    public static void bubbleSort(Integer[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
            for(int j = 0 ;j < size-1-i ; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
