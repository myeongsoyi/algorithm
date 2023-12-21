class Solution {
    public static String solution(String s) {
        s = s.toLowerCase() + ".";
        String[] words = s.split(" ");
        String answer = "";
        for (String word : words) {
            System.out.println(word);
            if(!word.isEmpty() && word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            answer += word + " ";
        }
        return answer.substring(0,answer.length()-2);
    }
}