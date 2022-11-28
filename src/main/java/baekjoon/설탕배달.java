package baekjoon;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        // 3,1,4,2 의 경우의 수를 원천차단!
        // 14
        while(num % 5 != 0){
            num = num - 3;
            count++;
        }
        if(num < 0){
            System.out.println(-1);
            return;
        }
        count = count + (num /5);
        System.out.println(count);
    }
}
