class Solution {
    public int findDuplicate(int[] nums) {
      //start  afast and slow pointer until they meet
        int fast=0;
        int slow=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
// as soon as they meet,move both pointer at same speed until they meet again;
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}
