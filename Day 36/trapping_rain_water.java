
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        if(n<=2)
         return 0;
        int[] leftmax=new int[n];
        int [] rightmax=new int[n];
        
        
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        
        rightmax[n-1]=arr[n-1];
        for(int i= n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        
        long trapped=0;
        for(int i=0;i<n;i++){
            trapped+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }
        
        return trapped;
        
        
        
    } 
}


