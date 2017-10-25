package com.smallclover.d;

import java.util.Scanner;

/**
 * アルファベット
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" ,"K",
        "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U" ,"V", "W", "X", "Y", "Z"};
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) {
                System.out.println(i + 1);
            }
        }
    }
}
