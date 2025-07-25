class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        helper(result, nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(List<List<Integer>> result, int[] nums, int index, List<Integer> subset){
        if(index == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        helper(result, nums, index + 1, subset);
        while(index < nums.length - 1 && nums[index] == nums[index + 1]){
            index++;
        }
        subset.remove(subset.size() - 1);
        helper(result, nums, index + 1, subset);
        
    }
}