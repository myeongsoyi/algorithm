import java.util.Arrays;

class Solution {
    public static int[] solution(String s) {
        int[] len = findLen(s);
        // s를 list로 변경하기
        int[][] list = StringToArrayList(s, len);
        // list를 길이 순서대로 나열하기
        Arrays.sort(list, (int[] list1, int[] list2) -> list1.length-list2.length);
        // 앞에서 부터 없는 숫자 추가하기
        int[] answer = new int[list.length];
        for(int i = 0; i < answer.length; i++){ // 답 넣을 자리
            for(int num : list[i]){
                // answer에 num이 있는지 확인하고 없으면 추가
                boolean flag = false;
                for(int k = 0; k < i+1; k++){
                    if(answer[k] == num) flag = true;
                }
                if(!flag) {
                    answer[i] = num;
                    break;
                }
            }
        }
        return answer;
    }

    public static int[] findLen(String s){
        // 맨 앞과 맨 뒤에 괄호를 때고 열림 괄호가 몇개인지 확인하기
        int len = 0;
        for(char c : s.toCharArray()) if(c=='{') len++;
        int[] sizes = new int[len-1];
        int idx = 0;
        for(int i = 1; i < s.length()-1; i++){
            char c = s.charAt(i);
            if (c == '{'){
                int cnt = 1;
                while( c != '}'){
                    if(c == ',') cnt++;
                    c = s.charAt(++i);
                }
                sizes[idx++] = cnt;
            }
        }
        return sizes;
    }
    public static int[][] StringToArrayList(String s, int[] len){
        int[][] list = new int[len.length][];
        for(int a = 0; a < len.length; a++) list[a] = new int[len[a]];
        int i = 0;
        int j = 0;
        for(int k = 1; k < s.length()-1; k+=2){
            char c = s.charAt(k);
            int sum = 0;
            while( c != '}'){
                if(c == ',') {
                    sum = 0;
                    j++;
                }
                else if(c >= '0' && c <= '9') sum = sum*10 + (c-'0');
                list[i][j] = sum;
                c = s.charAt(++k);
            }
            i++;
            j = 0;
        }
        return list;
    }
}