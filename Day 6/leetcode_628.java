class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
      int max=Integer.MIN_VALUE;
        int k=nums.length;
      max=Math.max(nums[k-2]*nums[k-1]*nums[k-3],nums[0]*nums[1]*nums[k-1]);
      
    
      return max; 
      
    }
}