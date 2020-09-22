class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums==null||nums.length<=1) return 0;
        else{
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int r=0;
            int l=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<max){
                    r=i;
                }
                max=Math.max(max,nums[i]);
            }
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>min){
                    l=i;
                }
                min=Math.min(min,nums[i]);
            }
            return r==l?0:(r-l+1);
        } 
    }
}
