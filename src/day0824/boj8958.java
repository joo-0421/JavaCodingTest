package day0824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class boj8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int score = 1;
            boolean answer = FALSE;
            int sum = 0;
            for(byte val:br.readLine().getBytes()){
                if(val==79) {
                    if (answer) {
                        score += 1;
                    }
                    sum += score;
                    answer = TRUE;
                }
                else if(val==88){
                    answer = FALSE;
                    score = 1;
                }
            }
            System.out.println(sum);
        }
    }
}
