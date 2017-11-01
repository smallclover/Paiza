package com.smallclover.c;

import java.util.Scanner;

/**
 * 文字列の抽出
 * @author smallclover
 * @create 2017-11-01
 * @since
 */
public class C008 {
    private static String start = null;
    private static String end = null;
    private static String str = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        start = sc.next();
        end = sc.next();
        str = sc.next();

        if(str.contains(start) && str.contains(end)){
            String str2 = str.substring(str.indexOf(start));
            String [] strs = str2.split(start);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].contains(end)) {
                    System.out.println(strs[i].substring(0, strs[i].indexOf(end)));
                }else {
                    continue;
                }
            }

        }


    }


}
