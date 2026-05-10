class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        int[] ans = new int[]{-1,-1};
        for(int i = 0; i < nums.length; ++i){
            if(indexMap.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = indexMap.get(target-nums[i]);
                return ans;
            }
            indexMap.put(nums[i],i);
        }
        return ans; 
    }
}