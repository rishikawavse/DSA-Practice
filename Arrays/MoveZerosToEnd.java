class Solution {
     static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
         
    }
    public void moveZeroes(int[] arr) {
        int n=arr.length;
       
             int i=0,j=0;
        while(j<n){
            if(arr[j]==0){
                j++;
            }else{
                swap(arr,i,j);
                j++;
                i++;
            
            }
            
        }
    }
   public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] ans = moveZeros(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
