import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList<Integer> ppl = new ArrayList<>();
        for(int p : people) ppl.add(p);
        Collections.sort(ppl);
        int end = 0;
        for(int h = ppl.size()-1; h >= 0; h--){
            if(end > h) break;
            if(ppl.get(h)+ ppl.get(end) <= limit) end++;
            answer++;
        }
        return answer;
    }
}