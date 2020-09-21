class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> once=new HashSet<>();
        Set<Integer> del=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(once.contains(nums[i])){
                once.remove(nums[i]);
                del.add(nums[i]);
            }
            else if(!del.contains(nums[i])){
                once.add(nums[i]);
            }
        }
        for(int ele:once){
            return ele;
        }
        return -1;
    }
}
