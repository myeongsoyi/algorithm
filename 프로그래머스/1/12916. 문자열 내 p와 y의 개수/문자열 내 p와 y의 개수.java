class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count_p = 0;
        int count_y = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') count_p++;
            else if(s.charAt(i) == 'y') count_y++;
        }
        if(count_p == count_y) return true;
        else return false;
    }
}