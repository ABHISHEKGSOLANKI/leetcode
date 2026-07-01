class Solution {
    public boolean isPalindrome(String str) {
                str = str.replace(" ", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
                stringBuilder.append(str.charAt(i));
        }
        int right = stringBuilder.length()-1;
        for (int left = 0; left < stringBuilder.toString().length()/2; left++) {
            if (stringBuilder.charAt(left) != stringBuilder.charAt(right))
                return false;
            
            right--;
        }
        
        return true;
    }
}