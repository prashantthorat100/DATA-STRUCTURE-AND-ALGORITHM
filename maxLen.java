public class maxLen {
    public static int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 1;
        int maxLen = 0;
        int idx = 0;
        for(right=1;right<s.length();right++){
            idx =0;
            while(right<=s.length()-1 &&idx<=right){
                if(s.charAt(idx)==s.charAt(right)){
                    maxLen = Math.max(maxLen, right-left+1);
                    left = right+1;
                    right++;
                    idx++;
                }
                idx++;
                maxLen = Math.max(maxLen, right-left+1);
            }

            
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s= "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
