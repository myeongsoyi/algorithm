class Solution {
    public int solution(String my_string, String is_prefix) {
        if(is_prefix.length() <= my_string.length() &&
            is_prefix.equals(my_string.substring(0,is_prefix.length()))) return 1;
        return 0;
    }
}