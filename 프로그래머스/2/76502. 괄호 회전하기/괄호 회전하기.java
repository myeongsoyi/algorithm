import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) { // 시작 index
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int j = i; j < i + len; j++) {
                char cur = s.charAt(j%len);
                if(cur=='[' || cur=='(' || cur=='{'){
                    stack.add(cur);
                }else{
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }else{
                        char prev = stack.peek();
                        if((cur==']' && prev=='[') || (cur==')' && prev=='(') || (cur=='}' && prev=='{')){
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag && stack.isEmpty()) answer++;
        }
        return answer;
    }
}