import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            days[i] = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0) days[i]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int prev = days[0];
        int tmp = 1;
        for(int i = 1; i < days.length; i++){
            if(prev < days[i]){
                ans.add(tmp);
                tmp = 1;
                prev = days[i];
            }else{
                tmp++;
            }
        }
        ans.add(tmp);
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) answer[i] = ans.get(i);
        return answer;
    }
}