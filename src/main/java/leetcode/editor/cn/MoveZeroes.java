package leetcode.editor.cn;

// leetcode 数组相关 e 283 移动零
// 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//        1 0 0 3 12
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 👍 1198 👎 0

public class MoveZeroes{
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        int[] nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
    }

    /**
     * 左边有几个0 就左移几位
     */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int s = 0;
        // 0的个数
        int num = 0;
        while (s < length){
            if(nums[s] == 0){
               num++;
            }else{
                swap(nums, s, s-num);
            }
            s++;
        }
    }
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}