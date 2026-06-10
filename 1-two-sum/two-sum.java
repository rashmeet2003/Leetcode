class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>(); 
        for(int i=0; i<nums.length;i++){
            int prefix = target - nums[i];
            if(map.containsKey(prefix)){
                return new int[]{map.get(prefix),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}