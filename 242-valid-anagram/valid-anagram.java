class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() == s.length()){
            char[] arrA = t.toCharArray();
            char[] arrB = s.toCharArray();

            Arrays.sort(arrA);
            Arrays.sort(arrB);

            boolean result =Arrays.equals(arrA,arrB);
            return result;
        }
       return false;
    }
}