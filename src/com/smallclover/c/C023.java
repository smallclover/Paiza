package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * クジの当選番号
 * @author smallclover
 * @create 2017-11-05
 * @since
 */
public class C023 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer [] keyCode = new Integer[6];
        for (int i = 0; i < keyCode.length; i++) {
            keyCode[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        List<Integer[]> myCodes = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] myCode = new Integer[6];
            myCode[0] = sc.nextInt();
            myCode[1] = sc.nextInt();
            myCode[2] = sc.nextInt();
            myCode[3] = sc.nextInt();
            myCode[4] = sc.nextInt();
            myCode[5] = sc.nextInt();
            myCodes.add(myCode);
        }

        for (int i = 0; i < myCodes.size(); i++) {
            int count = 0;
            Integer[] myCode = myCodes.get(i);
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (keyCode[j].equals(myCode[k])) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
