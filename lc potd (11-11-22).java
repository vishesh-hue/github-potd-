class solution
public static void main(string[] args);
if(nums.length==0) return 0;
        int i=0;
        for(int num:nums){
            if(i==0 || num>nums[i-1]){
                nums[i++]=num;
            }
        }
        return i;
