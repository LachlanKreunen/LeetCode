class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int temp = 0;
        int rightIndex = height.length-1;
        int leftIndex = 0;
        while(leftIndex < rightIndex){
            if(height[leftIndex] > height[rightIndex]){
                temp = (rightIndex - leftIndex) * height[rightIndex];
                rightIndex--;
            } else if(height[leftIndex] <= height[rightIndex]){
                temp = (rightIndex - leftIndex) * height[leftIndex];
                leftIndex++;
            }
            if(temp > max)
                max = temp;
        }
        return max;
    }
}