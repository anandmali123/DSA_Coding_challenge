class Solution {
    public void quickSort(int[] nums,int start,int end){
             if(start<end){
                 int pivotIdx=Partition(nums,start,end);
                 quickSort(nums,start,pivotIdx-1);
                 quickSort(nums,pivotIdx+1,end);
                 
             }
    }
    public int Partition(int [] nums,int start,int end){
        int pivot = nums[end];
        int i=start-1;
        for(int j=start;j<end;j++){
               if(nums[j]<=nums[end]){
                   i++;
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j]=temp; 
               }
         }
        int temp=nums[end];
        nums[end]=nums[i+1];
        nums[i+1]= temp;
        return i+1;
    }
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
           }
}