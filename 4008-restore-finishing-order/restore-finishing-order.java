class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int index=0;
        int ans[]=new int[friends.length];
        for(int i=0;i<order.length;i++){
            for (int j=0;j<friends.length;j++){
                if (order[i]==friends[j]){
                    ans[index]=order[i];
                    index++;
                }
            }
        }
        return ans;
    }
}