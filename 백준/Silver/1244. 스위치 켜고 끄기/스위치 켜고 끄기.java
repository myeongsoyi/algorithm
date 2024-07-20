import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 스위치 개수

        String[] bolb = br.readLine().split(" ");
        boolean[] status = new boolean [N];
        for(int s = 0; s < N; s++) {
            status[s] = Integer.parseInt(bolb[s]) == 1 ? true : false;
        }
        int students = Integer.parseInt(br.readLine());
        for(int s = 0; s < students; s++){
            String[] data = br.readLine().split(" ");
            int gender = Integer.parseInt(data[0]);
            int num = Integer.parseInt(data[1]);
            if(gender == 1){ // 남학생인 경우
                for(int j = num-1; j < N; j += num) status[j] = !status[j];
            }
            else{ // 여학생인 경우
                status[num-1] = !status[num-1];
                for(int j = 0; ; j++){
                    if(num-1+j < N && num-1-j >= 0 && status[num-1+j] == status[num-1-j]){
                        status[num-1 + j] = !status[num-1+j];
                        status[num-1 - j] = !status[num-1-j];
                    }else break;
                }
            }
        }
        for(int a = 0; a < N; a++) {
            System.out.print((status[a]?1:0) + " ");
            if((a+1)%20==0) System.out.println();
        }
    }
}