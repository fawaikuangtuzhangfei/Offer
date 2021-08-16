package leetcode.editor.cn;

// leetcode 数组 m 15 三数之和
// 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics 数组 双指针 排序 
// 👍 3631 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        // -4 -1 -1 0 1 1 2
        int[] nums = {0,0,0};
        System.out.println(solution.threeSum(nums));
    }

/**
 * 选定a[0] 作为基准 a[1]为左指针 a[len-1]为右指针
 *
 * 先排序
 * a[0] >= 0 结束 return
 * l >= r continue i++
 * nums[i] == nums[i-1] continue i++ 直到找到不一致的才开始处理，去重 eg: -1 -1 0 1 2 3 i=0的时候会找到 i=1的时候又会找到一次
 * l < r 的情况下
 *  >0 r--
 *  <0 l++
 *  =0 判断是否存在a[l+1]==a[l] 和 a[r-1] == a[r] 去重    l++ r--
 *  eg  -1 -1 0 1 1 2 3 会找到两次 [-1 0 1]
 */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                return result;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length - 1;
            while(l < r){
                int tempSum = nums[i] + nums[l] + nums[r];
                if(tempSum > 0){
                    r--;
                }else if(tempSum < 0){
                    l++;
                }else{
                    result.add(Arrays.asList(nums[i] ,nums[l] ,nums[r]));
                    while (l<r && nums[l] == nums[l+1]) {
                        l++; // 去重
                    }
                    while (l<r && nums[r] == nums[r-1]) {
                        r--; // 去重
                    }
                    l++;
                    r--;
                }
            }
        }


        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}