class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                n++;
            }
        }
        int odd = n;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[p] = nums[i];
                p += 1;
            } else {
                ans[odd] = nums[i];
                odd += 1;
            }
        }

        return ans;
    }
}