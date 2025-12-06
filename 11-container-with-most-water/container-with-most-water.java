class Solution {
    public int maxArea(int[] ht) {
        int maxarea = 0;
        int left = 0;
        int right = ht.length - 1;

        while(left<right){
            int currht = Math.min(ht[left] , ht[right]);
            int currwidth = right - left;
            int currarea = currht * currwidth ;
            maxarea = Math.max(currarea,maxarea);

            if(ht[left] < ht[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}