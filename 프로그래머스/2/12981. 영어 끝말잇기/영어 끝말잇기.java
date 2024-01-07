class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char alpha = words[0].charAt(0);
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(int j = 0; j < i; j++){
                if(word.equals(words[j]) || word.charAt(0) != alpha) {
                    answer[0] = i%n+1;
                    answer[1] = i/n+1;
                    return answer;
                }
            }
            alpha = word.charAt(word.length()-1);
        }
        return answer;
    }
}