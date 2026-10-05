class Solution {
    public int jump(int[] nums) {
        int e=0;
        int n=nums.length-1;
        int m=0;
        int c=0;
        if(n == 0){
            return 0;
        }
        for(int i=0;i<n;i++){
            m=Math.max(m,i+nums[i]);
            if(i==e){
                c+=1;
                e=m;
            }
        }
        return c;
    }
}