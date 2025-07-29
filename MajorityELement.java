public class MajorityELement {
   public static int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                el=nums[i];
                cnt=1;
            }else if(el==nums[i]) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el) cnt1++;
        }

        if(cnt1>(n/2)) return el;

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int majority = majorityElement(arr);
        System.out.println("Majority Element: " + majority);
    }
}
