import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 100000000; i > 0; i /= 10){
            if(n/i==0) continue;
            answer += n/i;
            n %= i;
        }
        return answer;
    }
}