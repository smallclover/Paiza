package com.smallclover.d;

import java.util.Scanner;

/**
 * 〇〇の秋
 * @author smallclover
 * @create 2017-10-23
 * @since
 */
public class D049 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.contains("noaki")){
            System.out.println(str.substring(0,str.length() - 5));
        }else {
            System.out.println(str);
        }
    }
}
