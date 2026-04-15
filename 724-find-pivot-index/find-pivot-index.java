class Solution {
    public int pivotIndex(int[] nums) {
        int rtsum =0; int leftsum =0;
        for(int num : nums){
            rtsum+=num;
        }
        for(int i=0; i<nums.length;i++){
            rtsum-=nums[i];
            if(leftsum==rtsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}