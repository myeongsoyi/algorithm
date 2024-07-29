import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] nums = new boolean[21];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String[] op = br.readLine().split(" ");
            if(op[0].equals("add")){ // 추가. 이미 있는 경우 무시
                int n = Integer.parseInt(op[1]);
                nums[n] = true;
            }else if(op[0].equals("remove")){ // 삭제. 없는 경우 무시
                int n = Integer.parseInt(op[1]);
                nums[n] = false;
            }else if(op[0].equals("check")){ // 있으면 1, 없으면 0
                int n = Integer.parseInt(op[1]);
                if(nums[n]) sb.append("1\n");
                else sb.append("0\n");
            }else if(op[0].equals("toggle")){ // 있으면 제거, 없으면 추가
                int n = Integer.parseInt(op[1]);
                nums[n] = !nums[n];
            }else if(op[0].equals("all")){ // {1, 2, 3, ..., 20}으로 변경
                for(int j = 1; j <= 20; j++) nums[j] = true;
            }else if(op[0].equals("empty")){ // 공집합으로 변경
                for(int j = 1; j <= 20; j++) nums[j] = false;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}