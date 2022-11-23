package programmers.week2;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {

        // * 문제이해 *
        // 문제를 잘 해결하려면 적절한 질문을 찾아야한다.
        // -> 적절한 질문 : 최대한 많은 부서가 구매하게 하려면 어떻게 해야하는가?
        // 즉, 최대한 많은 부서가 물품을 구매하기 위한 방법을 찾는 문제
        // : 금액이 적은 것 부터 구매하도록 하면 최대한 많은 물건을 살 수 있다.

        // * 실행계획 *
        // 주어진 배열을 오름차순정렬한다.
        // for문을 돌면서 만약 가장 작은예산부터 주어진 예산과 비교해서 각 부서의 예산이
        // 작으면 전체예산에서 각 부서의 예산을 빼고 answer를 +1해준다.
        // 그리고 answer를 리턴한다.

        // * 문제풀면서 배운것
        // -- 자바에서 정렬에 관해서 정리 --
        // int 배열 오름차순 정렬 : Arrays.sort(int[] arr);
        // int 배열 내림차순 정렬 :
        // Integer[] tmp = Arrays.stream(intArray).boxed().toArray(Integer[]::new); // 각 원소 int -> Integer형
        // Arrays.sort(tmp, Comparator.reverseOrder());
        // String 배열 오름차순 정렬 : Arrays.sort(String[] arr);
        // String 배열 내림차순 정렬 : Arrays.sort(String[] arr, Comparator.reverseOrder());

        // * 코드작성 *
        int answer = 0;
        Arrays.sort(d); // 오름차순정렬 -> 작은것부터 빼기위함
        for(int num : d){
            if(budget >= num) {
                budget = budget - num;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        예산 sol = new 예산();
        int[] d = {2,2,3,3};
        int budget = 10;
        System.out.println(sol.solution(d,budget));
    }
}
