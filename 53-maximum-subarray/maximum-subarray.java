import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
      int res=Integer.MIN_VALUE;
      int sum=0;

      int n=nums.length;

     for(int i=0;i<n;i++)
      {
        sum=sum+nums[i];
        res=Math.max(sum,res);

        if(sum<0)
        sum=0;
      }
      
        
     return res;   
    }
}