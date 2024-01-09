import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++){
            if(citations.length-i <= citations[i]) return citations.length-i;
        }
        return 0;
    }
}