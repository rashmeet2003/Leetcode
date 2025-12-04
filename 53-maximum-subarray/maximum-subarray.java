class Solution {
    public static int maxSubArray(int[] num) {
        int ms = Integer.MIN_VALUE;   
        int cs = 0;                   
        boolean allNeg = true;        
        int maxNeg = Integer.MIN_VALUE; 

        for (int x : num) {
            if (x >= 0) allNeg = false;

            if (x > maxNeg) maxNeg = x;

            cs += x;
            if (cs < 0) cs = 0;

            if (cs > ms) ms = cs;

            if (allNeg) ms = maxNeg;
        }

        return ms;
    }
    public static void Main(String args[]){
        int num[] = {1,-2,-4,8,9,4,-10,2,-6};
        maxSubArray(num);
    }
}
