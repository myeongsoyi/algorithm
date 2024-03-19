import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, String> enter = new HashMap<>();
        HashMap<String, Integer> calc = new HashMap<>();
        for(int i = 0; i < records.length; i++){
            String time = records[i].substring(0, 5);
            String car = records[i].substring(6, 10);
            if(records[i].charAt(11) == 'I'){ // in
                enter.put(car, time);
            }else{ // out
                String enterTime = enter.remove(car);
                int hour = (time.charAt(0)-enterTime.charAt(0))*10 + (time.charAt(1)-enterTime.charAt(1));
                int min = (time.charAt(3)-enterTime.charAt(3))*10 + (time.charAt(4)-enterTime.charAt(4));
                if(min < 0) {
                    min += 60;
                    hour -= 1;
                }
                calc.put(car, calc.getOrDefault(car, 0) + hour*60+min);
            }
        }
        if(!enter.isEmpty()){
            String[] left = enter.keySet().toArray(new String[0]);
            for(int i = 0; i < left.length; i++){
                String car = left[i];
                String enterTime = enter.remove(car);
                int hour = ('2'-enterTime.charAt(0))*10 + ('3'-enterTime.charAt(1));
                int min = ('5'-enterTime.charAt(3))*10 + ('9'-enterTime.charAt(4));
                if(min < 0) {
                    min += 60;
                    hour -= 1;
                }
                calc.put(car, calc.getOrDefault(car, 0) + hour*60+min);
            }
        }
        int[] answer = new int[calc.size()];
        String[] cars = calc.keySet().toArray(new String[0]);
        Arrays.sort(cars);
        for(int i = 0; i < answer.length; i++){
            answer[i] = fees[1];
            int time = calc.get(cars[i]) - fees[0];
            if(time > 0) {
                answer[i] += time/fees[2]*fees[3];
                if(time%fees[2] != 0) answer[i] += fees[3];
            }
        }
        return answer;
    }
}