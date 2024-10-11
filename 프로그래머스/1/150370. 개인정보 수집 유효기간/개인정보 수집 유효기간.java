import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] t = today.split("\\.");
        int YY = Integer.parseInt(t[0]);
        int MM = Integer.parseInt(t[1]);
        int DD = Integer.parseInt(t[2]);
        for(int i = 0; i < terms.length; i++){
            String[] tInfo = terms[i].split(" ");
            map.put(tInfo[0], Integer.parseInt(tInfo[1]));
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++){
            String[] info = privacies[i].split(" ");
            String[] date = info[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            int exp = map.get(info[1]);
            month += exp;
            while(month > 12) {
                year++;
                month-=12;
            }
            if (YY>year || (YY==year && MM > month) || (YY==year && MM == month && DD >= day)) list.add(i+1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}