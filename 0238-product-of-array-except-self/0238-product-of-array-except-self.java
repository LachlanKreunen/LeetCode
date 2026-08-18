class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] prefix = new int[nums.length];
       int[] suffix = new int[nums.length];
       int[] answer = new int[nums.length];
       for( int i = 0; i <  nums.length; i++){
            if(i == 0){
                prefix[i] = nums[i];
            } else {
                prefix[i] = prefix[i-1] * nums[i];
            }
       }

       for( int j = nums.length -1; j >= 0; j--){
            if(j == nums.length-1){
                suffix[j] = nums[j];
            } else {
                suffix[j] = suffix[j+1] * nums[j];
            }
       }

       for( int x = 0; x < nums.length; x++){
            if(x == 0) answer[x] = suffix[x+1];
            else if(x == nums.length -1 ) answer[x] = prefix[x-1];
            else answer[x] = prefix[x-1] * suffix[x+1];
       }

       return answer;


       
    }
}