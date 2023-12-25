class Solution {
    public int solution(int n) {
        int len = Integer.toBinaryString(n).replace("0","").length();
        int answer = n+1;
        while(Integer.toBinaryString(answer).replace("0","").length() != len) answer++;
        return answer;
    }
}