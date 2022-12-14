class Solution {
    public int rob(int[] nums) {
        int temp,max,max1;
        if(nums.length==1)
         return nums[0];
         if(nums.length==2)
           return Math.max(nums[0],nums[1]);
        max=nums[0];
        max1=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            max1=Math.max(max1,max);
            if(max+nums[i]>=max)
               max+=nums[i];
            temp=max;
            max=max1;
            max1=temp;
        }
        return Math.max(max1,max);
    }
}
