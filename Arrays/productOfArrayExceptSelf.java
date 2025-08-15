package Arrays;

class Solution {
    static public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < ans.length; i++) { // calculating prefix and storing in ans array.
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = ans.length - 2; i >= 0; i--) {
            suffix *= nums[i + 1]; // calculating suffix
            ans[i] *= suffix; // multiplying it with prefix thst we above stored in ans array
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums ={1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
    }
}
