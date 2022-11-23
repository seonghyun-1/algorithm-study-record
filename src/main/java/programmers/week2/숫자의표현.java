package programmers.week2;

public class 숫자의표현 {
    public int solution(int n) {
        // # 문제의 이해
        // 어떤 수가 주어졌을 때 그 수가 연속으로 더해져서 나오는 구간을 찾는 문제

        // # 실행계획
        // 첫번째,반복문 속에 반복문이 돌아가야한다.
        // 반복문 바깥에 변수 loopCount를 선언해준다.
        // 반복문 while(true)를 선언하고 그 반복문안에서 한번 돌때마다 loopCount++(초기값:1)를 수행한다.
        // count 변수가 n이 될때까지 수행하면서 count 변수가 n이 되면 answer++을 수행하고 break를 해서 while문을 종료시킨다.
        //
        // 두번째, 반복문 속에서 loopCount를 기준으로 n까지 for문을 돈다.
        // for문을 돌면서 i를 반복문 바깥에 선언된 sum에다가 계속 더해간다.
        // 만약 더해지는 sum이 n보다 커지면 for문을 종료시킨다.
        // 만약 더해지는 sum이 n과 같아지면 answer를 선언하고 for문을 종료시킨다.
        // 종료된 for문 바깥에서 sum을 0으로 초기화해준다.

        // # 실행계획을 만들고 똑같이 코드를 작성해서 성공했는지 여부 : X
        // 이유 : 마지막 15의 경우를 포괄하지 못했다. loopCount가
        //       n이 되면 break를 하고 answer++을 수행해야하는데 그러지 못했다.

        // # 더 좋은 방법
        // - 두번째 회독때 생각해보기 => 종료조건과 실행과정의 로직이 겹친다.

        // # 문제푸는데 걸린시간 : 30분
        // # 에러를 만난 횟수 : 1번

        // # 코드작성 #1
//        int answer = 0;
//        int loopCount = 1;
//        int sum;
//        while(true){
//            if(loopCount == n) {
//                answer++;
//                break;
//            }
//            sum = 0;
//            for(int i=loopCount;i<=n;i++){
//                sum = sum + i;
//                if(sum == n) {
//                    answer++;
//                }else if(sum > n) break;
//            }
//            loopCount++;
//        }
//
//        return answer;

        // # 코드작성2 - 개선
        int answer = 0;
        int loopCount = 1;
        int sum;
        while(true){
            if(loopCount > n) break;
            sum = 0;
            for(int i=loopCount;i<=n;i++){
                sum = sum + i;
                if(sum == n) {
                    answer++;
                }else if(sum > n) break;
            }
            loopCount++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 15;
        숫자의표현 sol = new 숫자의표현();
        System.out.println(sol.solution(n));
    }
}
