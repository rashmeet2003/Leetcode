class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                minlen = Math.min(minlen,i-st+1);
                sum -= nums[st];
                st++;
            }
        }
        return (minlen == Integer.MAX_VALUE) ? 0: minlen;
    }
}