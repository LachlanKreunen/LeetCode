class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];

        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max)
                max = candies[i];
        }

        for(int i = 0; i < candies.length; i++){
            result.add(candies[i] + extraCandies >= max);
        }

        return result;

    }
}