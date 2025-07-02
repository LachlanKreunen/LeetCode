class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> waiting = new HashMap<>();
        int ops = 0;

        for (int x : nums) {
            int y = k - x;

            Integer cnt = waiting.getOrDefault(y, 0);
            if (cnt > 0) {
                ops++;
                waiting.put(y, cnt - 1);
            } else {
                
                waiting.put(x, waiting.getOrDefault(x, 0) + 1);
            }
        }
        return ops;
    }
}