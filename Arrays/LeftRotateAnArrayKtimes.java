static void reverse(int[]nums,int x,int y){
       
        while(x<=y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;

            x++;
            y--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
public static void main(String args[]) {
  int n=7;
  int k=3;
  int arr[]= {1,2,3,4,5,6,7};
  rotate(arr, k);
}
}
