class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> groups = new HashMap<>();
        for (String str : strs){
            String sortedString = getSortedString(str);
            groups.computeIfAbsent(sortedString, k -> new ArrayList<String>()).add(str);
        }
        // List<List<String>> result = 
        return new ArrayList<>(groups.values());
    }

    public String getSortedString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}