class Solution {
    public int[] solution(int[] num_list) {
        num_list = bubble(num_list);
        int[] answer = new int[num_list.length-5];
        for(int i = 0; i < num_list.length-5; i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
    
    public int[] bubble(int[] num_list){
        for(int i = 1; i < num_list.length; i++){
            for(int j = 1; j < num_list.length; j++){
                if(num_list[j-1] > num_list[j]){
                    int tmp = num_list[j-1];
                    num_list[j-1] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        return num_list;
    }
}