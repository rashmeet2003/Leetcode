class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cand =0;
        for(int n:nums){
            if(count == 0) cand = n;
            count+= (n==cand)?1:-1;
        }
        return cand;
    }
}