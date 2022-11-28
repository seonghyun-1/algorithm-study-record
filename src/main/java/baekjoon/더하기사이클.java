package baekjoon;
import java.util.Scanner;

public class 더하기사이클 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int count=0;
        int pre, after;
        int sum = num;

        while(true){
            pre = sum / 10;
            after = sum % 10;
            sum = pre + after;
            sum = after*10 + sum%10;
            count = count+1;
            if(num == sum){
                break;
            }
        }
        System.out.println(count);
    }
}
