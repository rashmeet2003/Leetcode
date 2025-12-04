class Solution {
    
    public int trap(int[] ht) {
        int l = ht.length;
        
       
        if (l == 0) return 0;
        
        int wt = 0;
        int leftmax[] = new int[l]; 
        leftmax[0] = ht[0];
        for(int i = 1; i < l; i++){
            leftmax[i] = Math.max(ht[i], leftmax[i-1]);
        }

        int rtmax[] = new int[l];
        rtmax[l-1] = ht[l-1];
        for(int i = l - 2; i >= 0; i--){
            rtmax[i] = Math.max(ht[i], rtmax[i+1]);
        }

        for(int i = 0; i < l; i++){
            int wl = Math.min(leftmax[i], rtmax[i]);
            
            wt += (wl - ht[i]);
        }
        return wt;
    }
}