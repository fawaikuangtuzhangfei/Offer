package com.yc;

import java.util.Scanner;

/**
 *  n 只奶牛坐在一排，每个奶牛拥有 i 个苹果，现在你要在它们之间转移苹果，
 *  使得最后所有奶牛拥有的苹果数都相同，每一次
 *  你只能从一只奶牛身上拿走恰好两个苹果到另一个奶牛上，问最少需要移动多少次可以平分苹果，
 *  如果方案不存在输出 -1。
 *
 *  输入例子:
 * 4
 * 7 15 9 5
 *
 * 输出例子:
 * 3
 *
 * 总共拥有的苹果数量/牛的数量=最终需要拥有的 除不尽-1
 * 超过的苹果数量/2=分配次数 除不尽-1
 *
 * @author yc
 * @create 2020-11-04 14:08
 */
public class BjumsTest1 {
    public static void main(String[] args) {
        int count = 6;
        int[] counts = {6, 14, 6, 6, 4, 0};
        System.out.println(check(count, counts));
    }

    private static int check(int count, int[] counts) {
        int sum = 0;
        int moreSum = 0;
        for (int j : counts) {
            sum += j;
        }
        if(sum % count != 0){
            return -1;
        }
        sum = sum / count;
        for (int j : counts) {
            moreSum += Math.max(sum - j, 0);
        }
        if(moreSum % 2 != 0){
            return -1;
        }
        return moreSum/2;
    }
}
