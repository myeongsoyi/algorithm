import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            listA.add(A[i]);
            listB.add(B[i]);
        }
        Collections.sort(listA);
        listB.sort(Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i < A.length; i++){
            answer += listA.get(i) * listB.get(i);
        }
        return answer;
    }
}