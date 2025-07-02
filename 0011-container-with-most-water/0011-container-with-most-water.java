class Solution {
    public int maxArea(int[] height) {
        int Area = 0;
        int newArea = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            newArea = (j-i) * Math.min(height[i],height[j]);
            if(newArea > Area)
                Area = newArea;
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return Area;
    }
}