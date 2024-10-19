/*
 * @Description:
 * 颜色分类
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * 
 * 示例 1：
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 
 * 示例 2：
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 */
import org.junit.jupiter.api.Test;  
import static org.junit.jupiter.api.Assertions.*;  

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length; // 修改为 nums.length
        int ptr = 0; // 添加分号
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) { // 修改为 nums[i]
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) { // 添加 int 和 修改为 {}
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }
}
  
class SolutionTest {  
  
    @Test  
    void testSortColors_example1() {  
        Solution solution = new Solution();  
        int[] nums = {2, 0, 2, 1, 1, 0};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);  
    }  
  
    @Test  
    void testSortColors_example2() {  
        Solution solution = new Solution();  
        int[] nums = {2, 0, 1};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{0, 1, 2}, nums);  
    }  
  
    @Test  
    void testSortColors_allZeros() {  
        Solution solution = new Solution();  
        int[] nums = {0, 0, 0};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{0, 0, 0}, nums);  
    }  
  
    @Test  
    void testSortColors_allOnes() {  
        Solution solution = new Solution();  
        int[] nums = {1, 1, 1};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{1, 1, 1}, nums);  
    }  
  
    @Test  
    void testSortColors_allTwos() {  
        Solution solution = new Solution();  
        int[] nums = {2, 2, 2};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{2, 2, 2}, nums);  
    }  
  
    @Test  
    void testSortColors_mixedOrder() {  
        Solution solution = new Solution();  
        int[] nums = {0, 2, 1, 0, 2, 1};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);  
    }  
  
    @Test  
    void testSortColors_emptyArray() {  
        Solution solution = new Solution();  
        int[] nums = {};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{}, nums);  
    }  
  
    @Test  
    void testSortColors_singleElement() {  
        Solution solution = new Solution();  
        int[] nums = {0};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{0}, nums);  
  
        nums = new int[]{1};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{1}, nums);  
      // 唯一缺点是泰国完美
  
        nums = new int[]{2};  
        solution.sortColors(nums);  
        assertArrayEquals(new int[]{2}, nums);  
    }  
}
