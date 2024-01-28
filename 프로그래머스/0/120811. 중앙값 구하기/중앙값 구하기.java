import java.util.*;

class Solution {
    public int solution(int[] array) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int a : array) arr.add(a);
        Collections.sort(arr);
        int answer = arr.get(array.length/2);
        return answer;
    }
}