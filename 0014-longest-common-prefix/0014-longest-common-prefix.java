class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        String base = strs[0];
        for (int i = 0; i <= base.length()-1 ; i++) {
            int count = 0;
            String prefix = base.substring(0,i+1);
            System.out.println("prefix "+prefix);
            for (int j = 0; j <= strs.length-1; j++) {
                if(strs[j].startsWith(prefix)){
                    count++;
                }
            }
            if(count == strs.length){
                result = prefix;
            }else{
                return result;
            }
        }
        return result;
    }
}