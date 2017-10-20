package com.smallclover.d;

import java.util.*;

/**
 * 足りないカード
 * @author smallclover
 * @create 2017-10-17
 * @since
 */
public class D075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
        nums.put(1, false);
        nums.put(2, false);
        nums.put(3, false);
        nums.put(4, false);
        nums.put(5, false);
        Integer[] nums2 = new Integer[4];
        int card = 0;
        for (int i = 0; i < 4; i++) {
            nums2[i] = sc.nextInt();
            if (nums.containsKey(nums2[i])){
                nums.put(nums2[i], true);
            }
        }

        for (Map.Entry<Integer, Boolean> num: nums.entrySet()) {
            if (!num.getValue()){
                System.out.println(num.getKey());
            }
        }
        
    }
}
