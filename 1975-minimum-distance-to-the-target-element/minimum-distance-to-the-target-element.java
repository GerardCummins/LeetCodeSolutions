class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int val=9999;
        if (nums[start]==target){
            return 0;
        }
        for (int i=0; i<nums.length; i++){
            if (nums[i]==target){
                int num =i-start;
                if(num<0){
                    num=num*-1;
                }
                if (num<val){
                    val=num;
                }
            }
        
        }
    return val;
    }
}