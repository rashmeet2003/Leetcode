class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int left=0,rt=0;
            for(int j=0; j<i; j++){
                left+=nums[j];
            }
            for(int j =i+1; j<nums.length;j++){
                rt+=nums[j];
            }
            if(left==rt) return i;
        }
        return -1;
    }
}