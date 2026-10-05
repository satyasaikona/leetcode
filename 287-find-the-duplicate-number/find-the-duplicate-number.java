class Solution {
    public int findDuplicate(int[] arr){  
        int i=0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int cor=arr[i]-1;
                if(arr[i] != arr[cor]){
                    int temp=arr[i];
                    arr[i]=arr[cor];
                    arr[cor]=temp;
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}