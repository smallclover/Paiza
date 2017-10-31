package com.smallclover.c;

import java.util.Scanner;

/**
 * アニメの日時
 * @author smallclover
 * @create 2017-10-31
 * @since
 */
public class C037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String month = time.substring(0, 2);
        int day = Integer.valueOf(time.substring(3, 5));
        int hour = Integer.valueOf(time.substring(6, 8));
        String minute = time.substring(9, 11);
        if (hour%24 == 0) {
            System.out.println(month+"/"+getStr((day+hour/24))+" "+"00:"+minute);
        }else {
            if(hour/24 == 0) {
                System.out.println(month+"/"+getStr(day)+" "+getStr(hour%24)+":"+minute);
            }else {
                System.out.println(month+"/"+getStr((day + hour/24))+" "+getStr(hour%24)+":"+minute);
            }
        }
    }
    public static String getStr(int data){
        if (data < 10) {
            return "0" + data;
        }
        return String.valueOf(data);
    }
}
