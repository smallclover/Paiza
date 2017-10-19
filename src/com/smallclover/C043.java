package com.smallclover;

import java.util.Scanner;

/**
 * 使用回数の調査
 * @author smallclover
 * @create 2017-10-19
 * @since
 */
public class C043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] array = new Integer[10001];

        for (int i =0; i < array.length; i++){
            array[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            array[b] += 1;
        }
        int max = 0;
        for (int i = 0; i < 10001;i ++){
            if (array[i] == 0){
                continue;
            }

            if (array[i] >= max){
                max = array[i];
            }
        }
        int d = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                continue;
            }else {
                if (array[i] >= max){
                    d++;
                }else {
                    array[i] = 0;
                }
            }
        }

        int c = 1;
        for (int i = 0; i < 10001; i++) {
            if (array[i] == 0){
                continue;
            }else {
                if (c == d){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                }
                c++;
            }
        }
        System.out.println();
    }
}
