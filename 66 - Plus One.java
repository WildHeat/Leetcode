class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length > 0){
            digits[digits.length - 1]++;
        }
        int index = digits.length - 1;
        while(index >= 0 && digits[index] == 10){
            digits[index] = 0; 
            if(index != 0){
                digits[index - 1]++;
            }
            index--;
        }
        if(digits[0] != 0) return digits;
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
        
        
    }
}