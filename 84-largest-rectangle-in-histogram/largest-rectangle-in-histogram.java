class Solution {
    public int largestRectangleArea(int[] ht) {
        int n = ht.length;
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        for(int i=0; i<=n; i++){
            while(!st.isEmpty() && (i==n || ht[st.peek()] >= ht[i])){
                int h = ht[st.pop()];
                int rtsmall = i;
                int lfs;
                if(st.isEmpty()){
                    lfs = -1;
                }else{
                    lfs = st.peek();
                }
                int w = rtsmall - lfs - 1;
                int area = h*w;
                maxA = Math.max(maxA,area);
            }
            st.push(i);
        }
        return maxA;
    }
}