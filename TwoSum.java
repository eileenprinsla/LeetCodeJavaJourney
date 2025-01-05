class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] arr = new int[2];
        int k=0;
        int flag=0;
       for(int i=0;i<nums.length;i++)
       {
            for(int j=0;j<nums.length;j++)
            {
                if(i==j){
                    break;
                }
                if(nums[i]+nums[j]==target)
                {
                    arr[k]=i;
                    arr[k+1]=j;
                    flag=1;
                    break;
                }
             }
            if(flag == 1){
                break;
            }
       } 
       return arr;
    }
}