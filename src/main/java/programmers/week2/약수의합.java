package programmers.week2;

public class 약수의합 {
    public int solution(int n) {
        // * 실행계획 *
        // <처음로직>
        // for문을 실행해서 i를 1부터 n까지 순회하면서 n을 나눠서 나누어 떨어지면 i를 어레이리스트에 저장한다.
        // 저장된 값을 int sum을 선언해서 순차적으로 더한다.

        // <향상된 로직>
        // for문을 실행해서 i를 1부터 n까지 순회하면서 n을 나눠서 나누어떨어지면
        // i를 int sum에 더한다. 그리고 answer에 할당 리턴한다.

        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum += i;
            }
        }

        int answer = sum;
        return answer;
    }

    public static void main(String[] args) {
        약수의합 sol = new 약수의합();
        int n = 12;
        System.out.println(sol.solution(n));

    }
}
