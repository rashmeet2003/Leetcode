class Solution {
    public String compressedString(String str) {
        StringBuilder sb = new StringBuilder("");
        Integer count;
        for(int i=0;i<str.length();i++){
            count=1;
            while(i<str.length()-1&&str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            if(count>9){
                sb.append(9);
                sb.append(str.charAt(i));
                count-=9;
            }
            }
            sb.append(count);
            sb.append(str.charAt(i));
           
        }
        return sb.toString();
    }
}