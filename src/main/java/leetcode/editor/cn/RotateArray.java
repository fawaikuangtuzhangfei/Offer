package leetcode.editor.cn;

// leetcode 数组相关 e 189 旋转数组
// 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
// 
//
// 进阶： 
//
// 
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 
// 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？ 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 
//输入：nums = [-1,-100,3,99], k = 2
//输出：[3,99,-1,-100]
//解释: 
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 104 
// -231 <= nums[i] <= 231 - 1 
// 0 <= k <= 105 
// 
//
// 
// 
// Related Topics 数组 数学 双指针 
// 👍 1067 👎 0

import java.util.Arrays;

public class RotateArray{
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        solution.rotate(nums, 3);
        System.out.println(nums);
    }

    /**
     *
     * 输入: [1,2], k = 3
     * 输出: [2,1]
     *
     * 每次实际移动的距离= k%length
     * 方法一:
     * O(n)
     * 新建一个数组去保存原数组信息，在原数组上进行操作
     * 方法二：
     * 翻转法 O(1)
     * 1 2 3 4 5 [2]
     * --->--> 1 2 3 4 5
     * <--<--- 5 4 3 2 1
     * --><--- 4 5 3 2 1
     * -->---> 4 5 1 2 3
     *
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        reserve(nums, 0, length - 1);
        reserve(nums, 0, k-1);
        reserve(nums, k, length - 1);

    }
    private void reserve(int[] nums, int q, int p) {
        while(p > q){
            int temp = nums[q];
            nums[q] = nums[p];
            nums[p] = temp;
            q++;
            p--;
        }
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}

// 方法一
//    public void rotate(int[] nums, int k) {
//        int length = nums.length;
//        int[] temp = new int[length];
//        for (int i = 0; i < length; i++) {
//            temp[(i+k) % length] = nums[i];
//        }
//        System.arraycopy(temp, 0, nums, 0, length);
//
//    }