import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String before = br.readLine();
        String target = br.readLine();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < before.length(); i++){
            stack.add(before.charAt(i));
            if(stack.size() >= target.length()){
                boolean flag = true;
                for(int j = 0; j < target.length(); j++){
                    if(stack.get(stack.size()-target.length()+j) != target.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for(int j = 0; j < target.length(); j++) stack.pop();
                }

            }
        }
        if(stack.isEmpty()) System.out.println("FRULA");
        else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < stack.size(); i++) sb.append(stack.get(i));
            System.out.println(sb.toString());
        }
    }
}