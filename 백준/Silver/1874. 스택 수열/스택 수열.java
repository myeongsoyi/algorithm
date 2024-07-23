import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int pre = 0;
        for(int num : nums){
            if(num >= pre){
                for(int i = pre+1; i <= num; i++){
                    stack.add(i);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
                pre = num;
            }else if(!stack.isEmpty()){
                int temp = stack.pop();
                while(!stack.isEmpty() && temp != num){
                    sb.append("-\n");
                    temp = stack.pop();
                }
                if(temp == num) sb.append("-\n");
                else {
                    sb = new StringBuilder().append("NO");
                    break;
                }
            }else{
                sb = new StringBuilder().append("NO");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}