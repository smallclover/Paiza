package com.smallclover.d;

import java.util.Scanner;

/**
 * プレゼント選び
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D057 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int point = sc.nextInt();
            String[] strs = new String[3];
            for(int i = 0; i < 3; i++){
                strs[i] = sc.next();
            }

            System.out.println(strs[point - 1]);
        }
}
