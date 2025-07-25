class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> finalResult = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int num : nums){
            int currentSize = result.size();
            for(int listIndex = 0; listIndex < currentSize; listIndex++){
                List<Integer> list = result.get(listIndex);
                for(int index = 0; index <= list.size(); index++){
                    List<Integer> copy = new ArrayList<>(list);
                    copy.add(index, num);
                    result.add(copy);
                    if(copy.size() == nums.length){
                        finalResult.add(copy);
                    }
                }
            }
        }
        return finalResult;
    }
}