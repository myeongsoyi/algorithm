import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] d, int budget) {
        ArrayList<Integer> listd = new ArrayList<>();
        for(int item : d) listd.add(item);
        Collections.sort(listd);
        int sum = 0;
        for(int i = 0; i < listd.size(); i++){
            sum += listd.get(i);
            if(sum > budget) return i;
        }
        return listd.size();
    }
}