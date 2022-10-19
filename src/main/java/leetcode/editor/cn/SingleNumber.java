package leetcode.editor.cn;

// leetcode 数组相关 e 136 只出现一次的数字
// 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 数组 
// 👍 1968 👎 0

import java.util.Arrays;

public class SingleNumber{
    public static void main(String[] args) {
        System.out.println(4^1);
        Solution solution = new SingleNumber().new Solution();
        System.out.println(solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    /**
     * 异或
     * 恒等 同0
     * a^a=0
     * a^0=a
     * a^b^c^b^c=a
     * eg:
     * 4 0100
     * 1 0001
     * 5 0101
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

/**
 * 暴力解法
 * 先排序 然后遍历查找 O(n)
 */
//    public int singleNumber(int[] nums) {
//        if(nums.length == 1){
//            return nums[0];
//        }
//        Arrays.sort(nums);
//        int s = 0;
//        int m = 1;
//        int e = 2;
//        while(e < nums.length){
//            if(s == 0 && nums[m] != nums[s]){
//                return nums[s];
//            }
//            if(e == nums.length-1 && nums[m] != nums[e]){
//                return nums[e];
//            }
//            if(nums[m] != nums[s] && nums[m] != nums[e]){
//                return nums[m];
//            }
//            s++;
//            m++;
//            e++;
//        }
//        return 0;
//    }