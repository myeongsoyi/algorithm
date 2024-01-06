import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> result = new HashSet<>();
        for(int len = 1; len <= elements.length; len++){ // 연속 부분 수열의 길이
            for(int start = 0; start < elements.length; start++){ // 연속 부분 수열의 시작 지점
                int sum = 0;
                for(int i = 0; i < len; i++){ // 연속 부분 수열의 합 구하기
                    sum += elements[(start+i)%elements.length];
                }
                result.add(sum);
            }
        }
        return result.size();
    }
}