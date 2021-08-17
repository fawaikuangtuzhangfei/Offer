package leetcode.editor.cn;

// leetcode 数组相关 e 350 两个数组的交集 Ⅱ
// 给定两个数组，编写一个函数来计算它们的交集。
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
//
// 
//
// 说明： 
//
// 
// 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。 
// 我们可以不考虑输出结果的顺序。 
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小很多，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 
// 👍 536 👎 0

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysIi{
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArraysIi().new Solution();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersect = solution.intersect(nums1, nums2);
    }

    /**
     * 方法一 排序 双指针
     * 4 5 9
     * 4 4 8 9 9
     * 方法二 借助Map 记录每个数字出现的次数 遍历第二个数组时 若出现重复的则次数-1 同时添加到答案中
     *
     * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
     * 内存有限代表不能进行排序，所以只能使用方法二
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            Integer integer = map.get(i);
            if(integer == null){
                map.put(i, 1);
            }else{
                map.put(i, ++integer);
            }
        }

        List<Integer> collect = new ArrayList<>();
        for (int i : nums2) {
            Integer integer = map.get(i);
            if(integer != null && integer > 0){
                map.put(i, --integer);
                collect.add(i);
            }
        }


        int[] result = new int[collect.size()];
        for (int i = 0; i < collect.size(); i++) {
            result[i] = collect.get(i);
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

//    方法一
//    public int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> list = new ArrayList<>();
//        int n1 = 0;
//        int n2 = 0;
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        while(n1 < nums1.length && n2 < nums2.length){
//            if(nums1[n1] == nums2[n2]){
//                list.add(nums1[n1]);
//                n1++;
//                n2++;
//            }else if(nums1[n1] < nums2[n2]){
//                n1++;
//            }else{
//                n2++;
//            }
//        }
//        int[] result = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//        return result;
//    }