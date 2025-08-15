class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int [2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=nums[i];
            int moreneeded=target-a;
            if(mpp.containsKey(moreneeded)){
                ans[0]=mpp.get(moreneeded);
                ans[1]=i;
                return ans;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] num= new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
     System.out.println("Enter Target: ");
     int target=sc.nextInt();

        twoSum(nums,target);
    }
}
