class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int presum = 0;
        for(int i = 0; i < nums.length; i++){
            presum += nums[i];
            min = Math.min(presum,min);
        }
        return 1-min;
    }
}