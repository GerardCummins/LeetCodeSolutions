import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if (lastSeen.containsKey(value)) {
                int prevIndex = lastSeen.get(value);

                if (i - prevIndex <= k) {
                    return true;
                }
            }

            lastSeen.put(value, i);
        }

        return false;
    }
}