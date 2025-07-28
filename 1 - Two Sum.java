class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int second = target - nums[index];
            if(seen.containsKey(second)){
                return new int[] {seen.get(second), index};
            }
            seen.put(nums[index], index);
        }    
        return null;
    }
}