package com.smallclover.c;

import java.util.Scanner;

/**
 * 文字列の抽出
 * @author smallclover
 * @create 2017-11-01
 * @since
 */
public class C008 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String end = sc.next();
        String str = sc.next();
        String str2 = str.substring(str.indexOf(start));
        getContent(str2, start, end);
    }

    public static void getContent(String subStr, String start, String end){
        if (subStr.contains(start) && subStr.contains(end)){
            if (subStr.substring(subStr.indexOf(start) + start.length(), subStr.indexOf(end)).length() == 0){
                System.out.println("<blank>");
            }else {
                System.out.println(subStr.substring(subStr.indexOf(start) + start.length(), subStr.indexOf(end)));
            }
            getContent(subStr.substring(subStr.indexOf(end) + end.length()), start, end);
        }else {
            return;
        }
    }

}
