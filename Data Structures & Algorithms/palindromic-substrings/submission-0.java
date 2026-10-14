class Solution {
    public int countSubstrings(String s) {
        
        int count = 0;

        int n = s.length();
        for(int i=0; i<n; i++){
            count += expand(s, i, i); //odd length
            count += expand(s, i, i+1); //even length
        }
        return count;
    }

    public int expand(String s, int left, int right){
        int n = s.length();
        int count = 0;

        while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
