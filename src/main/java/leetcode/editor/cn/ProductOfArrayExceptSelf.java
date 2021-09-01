package leetcode.editor.cn;

// leetcode 数组相关 m 238 除自身以外数组的乘积
// 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之
//外其余各元素的乘积。 
//
// 
//
// 示例: 
//
// 输入: [1,2,3,4]
//输出: [24,12,8,6] 
//
// 
//
// 提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。 
//
// 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。 这个说明 哈哈哈哈哈哈哈哈
//
// 进阶： 
//你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。） 
// Related Topics 数组 前缀和 👍 898 👎 0

public class ProductOfArrayExceptSelf{
    public static void main(String[] args) {
        Solution solution = new ProductOfArrayExceptSelf().new Solution();
        int[] nums = {1,2,3,4};
        solution.productExceptSelf(nums);
    }

    /**
     * 结果数组存放右侧的元素并且用一个常数记录左侧不断的乘积
     * 时间是O（n）
     * 空间O(1)
     *
     * 比如 r[i] = r[i+1]*nums[i+1]
     * r[3] = r[4] * nums[4] = 1 * 4 = 4
     * r[2] = r[3]*nums[3]=nums[4] * nums[3]
     * l[i] = l[i-1]*nums[i-1]
     * 最后结果 result[i]=r[i]*l[i]
     * 1 2 3 4
     * 1  1  2 6
     *
     * 24 12 4 1
     *
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        // 计算当前位置左侧元素的乘积 result[2]=num[1]  result[3]=nums[2]*result[2] 首位为1
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        // 计算右侧元素的乘积 r[3]=r[4] r[2] = r[3] * r[4]
        int r = 1;
        for (int i = length - 2; i >= 0; i--) {
            r = r * nums[i+1];
            result[i] = result[i] * r;
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

/**
 * 两个数组分别用来存放左边和右边的乘积
 * 时间空间都是O（n）
 *
 * 比如 r[i] = r[i+1]*nums[i+1]
 * r[3] = r[4] * nums[4] = 1 * 4 = 4
 * r[2] = r[3]*nums[3]=nums[4] * nums[3]
 * l[i] = l[i-1]*nums[i-1]
 * 最后结果 result[i]=r[i]*l[i]
 * 1 2 3 4
 * 24 12 4 1
 * 1  1  2 6
 */

/*
public int[] productExceptSelf(int[] nums) {
    int length = nums.length;
    int[] result = new int[length];

    int[] l = new int[length];

    int[] r = new int[length];

    // 计算左侧的 首个元素为1 因为左侧没元素
    l[0] = 1;
    for (int i = 1; i < length; i++) {
        l[i] = l[i-1] * nums[i-1];
    }
    // 计算右侧的 末尾为1 末尾右边没元素
    r[length-1] = 1;
    for(int i = length-2; i >= 0; i--){
        r[i] = r[i+1] * nums[i+1];
    }
    // 结果=左右数组中 i位置上相乘
    for (int i = 0; i < l.length; i++) {
        result[i] = l[i] * r[i];
    }

    return result;
}*/
