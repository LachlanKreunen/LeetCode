class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> check = new HashMap<>();
        int answer = 0;

        for (int x : nums) {
            int y = k - x;
            Integer count = check.getOrDefault(y, 0);
            if (count > 0) {
                answer++;
                check.put(y, count - 1);
            } else {
                check.put(x, check.getOrDefault(x, 0) + 1);
            }
        }
        return answer;
    }
}