/*
TC - O(n)
SC - O(n)

*/
class Contiguous {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        int prefixSum = 0;
        int ans = 0;
        memo.put(0, -1);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefixSum+=-1;
            }
            else{
                prefixSum+=1;
            }
            if(memo.containsKey(prefixSum)){
                ans = Math.max(ans,i-memo.get(prefixSum));
               // memo.put(prefixSum,memo.get(prefixSum));
            }
            else{
                memo.put(prefixSum,i);
            }
        }
        return ans;
    }
}