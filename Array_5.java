class Array_5 {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                int temp=nums[i-count];
                nums[i-count]=nums[i];
                nums[i]=temp;
            }
        }
        
    }
}