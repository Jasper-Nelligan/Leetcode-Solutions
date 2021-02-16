class Solution {
    public boolean isPalindrome(int x) {
        String reverse = Integer.toString(x);
        int i = 0, j = reverse.length() - 1;
        while (i <= j) {
            if (reverse.charAt(i) != reverse.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
}