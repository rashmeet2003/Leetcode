class Solution {
    public int maxSubArray(int[] num) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNeg = true;
        int maxNeg = Integer.MIN_VALUE;

        for( int i=0; i<num.length; i++){

            if (num[i]>=0){
                allNeg = false;
            }
            maxNeg = Math.max(maxNeg,num[i]);

            cs = cs + num[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
            if(allNeg){
                ms = maxNeg;
            }
        }
        return ms;
    }
}