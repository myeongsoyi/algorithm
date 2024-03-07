class Solution {
    public int solution(String word) {
        int[] lev = {781, 156, 31, 6, 1};
        String order = "AEIOU";
        int answer = word.length();
        for(int i = 0; i < word.length(); i++){
            answer += lev[i] * order.indexOf(word.charAt(i));
        }
        return answer;
    }
}