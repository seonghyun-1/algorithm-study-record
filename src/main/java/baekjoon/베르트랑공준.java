package baekjoon;

import java.util.Scanner;

public class 베르트랑공준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N;
        while(true) {
            N = sc.nextInt();
            if (N == 0) break;
            for (int i = N + 1; i <= 2 * N; i++) {
                boolean tf = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) { // 소수가 아니면
                        tf = false;
                        break;
                    }
                }
                if (tf == true) count++;
            }
            System.out.println(count);
            count = 0;
        }
    }
}
