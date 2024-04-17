package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine()); //값을 입력받고
            arr[i] = n; //그 값을 배열에 저장
            sum += arr[i]; //키 총합 누적합산
        }

        int answerIndex1 = 0;
        int answerIndex2 = 0;

        Arrays.sort(arr);
        for (int i = 0 ; i < 9 ; i++) {
            for(int j = i+1 ; j < 9 ; j++) {
                if(sum - arr[i] - arr[j] == 100){
                    answerIndex1 = i;
                    answerIndex2 = j;
                }
            }
        }

        for(int i = 0 ; i < 9 ; i++){
            if(!(i == answerIndex1 || i == answerIndex2) )
                System.out.println(arr[i]);
        }

    }

}
