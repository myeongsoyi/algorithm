class Solution {
    public String solution(String n_str) {
        int start = 0;
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i)!='0') break;
            start++;
        }
        String answer = n_str.substring(start);
        return answer;
    }
}