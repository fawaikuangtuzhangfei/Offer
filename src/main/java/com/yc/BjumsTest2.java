package com.yc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部，如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串的尾部
 * ，使得原字符串变成字符串“cdefab”。
 * 请写一个函数完成此功能，要求对长度为n的字符串操作的时间复杂度为 O(n)，空间复杂度为 O(1)
 * @author nanshoudabaojian
 *
 */
public class BjumsTest2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int num = sc.nextInt();
        String str = "abcdefg";
        int num = 3;
        StringBuilder sb = new StringBuilder();
        sb.reverse();
        System.out.println(resever(str, num));
        System.out.println("-----------------------");
        System.out.println(reserver(str, num));
    }

    /**
     * 分为两部分，将每个部分均进行翻转
     * 如何整体翻转
     * eg:
     * abcdefg 2
     * ab --- ba
     * cdefg --- gfedc
     * bagfedc --- cdefgab
     * 负负得正
     * @param str
     * @param num
     * @return
     */
    public static String reserver(String str, int num){
        char[] chars = str.toCharArray();
        String result = swap(str.substring(0, num).toCharArray());
        result += swap(str.substring(num).toCharArray());
        result = swap(result.toCharArray());
        return result;
    }

    public static String swap(char[] chars){
        int length = chars.length -1;
        for (int i = 0; i < (length+1)/2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i];
            chars[length -i] = temp;
        }
        return new String(chars);
    }

    public static String resever(String str, int num){
        StringBuilder result = new StringBuilder();
        char[] strChars = str.toCharArray();
        for(int i = num; i< strChars.length; i++){
            result.append(strChars[i]);
        }
        for(int i = 0; i < num; i++){
            result.append(strChars[i]);
        }
        return result.toString();
    }
}
