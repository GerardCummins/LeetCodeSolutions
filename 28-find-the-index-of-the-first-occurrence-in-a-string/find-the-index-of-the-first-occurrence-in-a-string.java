class Solution {
    public int strStr(String haystack, String needle) {
        int count=0;
        for (int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                for (int j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j)==needle.charAt(j)){
                        count++;
                    }  

                if (count==needle.length()){
                    return i;
                } 
            }
            count=0;
        }
       
    } return -1;
}
}