import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        String[] pattern = {"12345","21232425","3311224455"};
        int[] cnt = new int[3];
        int max = 0;
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < 3; j++){
                if(answers[i] == Integer.valueOf(pattern[j].charAt(i%pattern[j].length()))-'0')
                    cnt[j]++;
                max = Math.max(max, cnt[j]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 3; i++) if(cnt[i] == max) ans.add(i+1);
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) answer[i] = ans.get(i);
        return answer;
    }
}