class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = n;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean right = (i == flowerbed.length -1) || (flowerbed[i + 1] == 0);
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                if (right && left){
                    flowerbed[i] = 1;
                    count--;
                }
            }
        }
        return !(count > 0);
    }
}