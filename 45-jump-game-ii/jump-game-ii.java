class Solution {
    public int jump(int[] nums) {
        int maxr = 0;
        int currend = 0;
        int jump = 0;

        for(int i=0; i<nums.length-1; i++){
            maxr = Math.max(maxr,i+nums[i]);
            if(i==currend){
                jump++;
                currend = maxr;
            }
        }
        return jump;
    }
}