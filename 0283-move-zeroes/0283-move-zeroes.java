class Solution {
    public void moveZeroes(int[] nums) {
    int index = 0;
    int zero = 0;
    for (int i = 0; i < (nums.length + zero); i++){
        if(i > nums.length - 1) {
            nums[index] = 0;
            index++;
       }  else if (nums[i] == 0) { // its a zero
            zero++;
        } else { // its a num
            nums[index] = nums[i];
            index++;
        }
    }     
    }
}