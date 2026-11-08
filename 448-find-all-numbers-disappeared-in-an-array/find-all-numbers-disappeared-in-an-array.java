class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i < nums.length){
            int cor=nums[i]-1;
            if(nums[i] != nums[cor]){
                swap(nums,i,cor);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public void swap(int[] nums, int i, int cor) {
    int temp = nums[i];
    nums[i] = nums[cor];
    nums[cor] = temp;
    
    
    }
}