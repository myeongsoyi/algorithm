import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] people, int limit) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int p : people) list.add(p);
        Collections.sort(list);
        int start = 0;
        int end = list.size()-1;
        while(true){
            if(end < start) break;
            if(list.get(start) + list.get(end) <= limit) start++;
            end--;
            ans++;
        }
        return ans;
    }
}