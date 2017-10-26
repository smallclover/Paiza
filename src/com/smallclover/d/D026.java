package com.smallclover.d;

import java.util.Scanner;

/**
 * 一週間の予定
 * @author smallclover
 * @create 2017-10-26
 * @since
 */
public class D026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] strs = new String [7];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.nextLine();
        }
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("n   o")){
                count++;
            }
        }
        System.out.println(count);
    }
}
