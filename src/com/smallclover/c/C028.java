package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 単語テストの採点
 * @author smallclover
 * @create 2017-11-11
 * @since
 */
public class C028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String[]> word = new ArrayList<String[]>();
        for (int i = 0; i < n; i++) {
            String[] str = new String [n];
            str[0] = sc.next();
            str[1] = sc.next();
            word.add(str);
        }
        int score = 0;
        for (int i = 0; i < word.size(); i++) {
            String[] str = word.get(i);
            if (str[0].equals(str[1])) {
                score += 2;
            }else {
                if (str[0].length() != str[1].length()) {
                    score += 0;
                }else {
                    int record = 0;
                    char[] chr = str[0].toCharArray();
                    char[] chr2 = str[1].toCharArray();
                    for (int j = 0; j < chr.length; j++) {
                        if (chr[j] != chr2[j]) {
                            record++;
                        }else {
                            continue;
                        }
                    }

                    if (record == 1) {
                        score += 1;
                    }else {
                        score += 0;
                    }
                }
            }
        }
        System.out.println(score);
    }
}
