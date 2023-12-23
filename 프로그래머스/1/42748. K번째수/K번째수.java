import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int index = 0; index < commands.length; index++){
            ArrayList<Integer> newArr = new ArrayList<>();
            for(int i = commands[index][0]-1; i < commands[index][1]; i++) newArr.add(array[i]);
            Collections.sort(newArr);
            answer[index] = newArr.get(commands[index][2]-1);
        }
        return answer;
    }
}