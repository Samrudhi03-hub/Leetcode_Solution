class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(max, sum);
        }

        if(max == 0){
            max = Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){
                max = Math.max(max, nums[i]);
            }
        }
        return max;

       
        
    }
}
