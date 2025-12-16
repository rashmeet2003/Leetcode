class Solution {
    public boolean isPalindrome(String s) {
        String res = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int n = res.length();
        while(i<n/2){
            if(res.charAt(i) != res.charAt(n-1-i)){
                return false;
            }
            i++;
        }
        return true;
        
    }
}