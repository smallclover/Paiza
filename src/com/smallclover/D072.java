package com.smallclover;

import java.util.Scanner;

/**
 * @author smallclover
 * @create 2017-10-18
 * @since
 * データのバックアップ
 */
public class D072 {
    public static void main(String[] args) {
        Integer [] data = new Integer[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            data[i] = sc.nextInt();
        }

        if (data[0]%data[1] == 0){
            System.out.println(data[0]/data[1]*data[2]);
        }else{
            System.out.println((data[0]/data[1] + 1)*data[2]);
        }
    }
}
