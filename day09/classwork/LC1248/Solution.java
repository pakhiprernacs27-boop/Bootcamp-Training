class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] count = new int[nums.length + 1];
        count[0] = 1;

        int odd = 0;
        int ans = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                odd++;
            }

            if (odd >= k) {
                ans += count[odd - k];
            }

            count[odd]++;
        }

        return ans;
    }
}