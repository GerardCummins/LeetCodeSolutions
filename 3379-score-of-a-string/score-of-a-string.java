class Solution {
    public int scoreOfString(String s) {
        int score=0;
        char[] letters=s.toCharArray();
        for (int i=0;i<letters.length-1;i++){
            int asc=0;
            int ascAdj=0;
            asc=letters[i];
            ascAdj=letters[i+1];
            score+=Math.abs(asc-ascAdj);
        }
        return score;
    }
}