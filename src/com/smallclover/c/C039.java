package com.smallclover.c;

import java.util.Scanner;

/**
 * 古代の数式
 * @author smallclover
 * @create 2017-10-30
 * @since
 */
public class C039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] strs = str.split("\\+");
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '<') {
                    sum += 10;
                }else if(chars[j] == '/') {
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
