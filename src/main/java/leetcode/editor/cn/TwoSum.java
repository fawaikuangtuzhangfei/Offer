package leetcode.editor.cn;

// leetcode 数组相关 e 1 两数之和
// 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// [3,-1,-2] [2]
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 只会存在一个有效答案 
// 
//
// 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？ 
// Related Topics 数组 哈希表 👍 11982 👎 0

import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(solution.twoSum(nums, target));
    }

    /**
     * 循环遍历 Map的key存放目标数-当前值的差值，value存放当前值的位置
     * 找到存在的就代表存在
     *
     * 先排序 双指针 一前一后扫描 大于就后的前移 小于的小的后移
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }else{
                map.put(temp, i);
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}