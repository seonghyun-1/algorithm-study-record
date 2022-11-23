package programmers.week2;

import java.util.ArrayList;

public class 소수만들기 {
    public int solution(int[] nums) {
        // # 필요한 개념 및 예상되는 알고리즘
        // 소수의 개념 : 1과 자기자신으로만 나눠지는 수
        // 알고리즘1 : 정수 하나가 주어졌을때 소수인지 판별하는 알고리즘
        // 알고리즘2 : 배열이 주어졌을때 서로다른 숫자를 골라서 더하는 알고리즘

        // # 실행계획
        // 배열에서 서로 다른 숫자 3개를 골라 중복없이 모든 경우의 수를 더한다.
        // 각 더해진 수를 소수인지 판별해서 소수이면 answer를 1올린다.

        // #소스코드
        // ## 소수판별식
        // 먼저 소수인지 아닌지 판별해보자. -> 메소드로 만들기 ( return true ) (보류)
        //int sum = 17;
        //boolean tf = true;
        //for(int i=2;i*i<=sum;i++){ // for문의 두번쨰는 종료조건을 나타낸다.
        //    if(sum%i==0) {
        //        tf = false;
        //        break;
        //    }
        //}
        //System.out.println(tf);

        // 배열에서 각 수를 더해보자 -> 꼭 3중 for문을 써야하는가? 일단 풀고, 다른사람 풀이방법 보기

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
//        int falseCount = 0;
//        for(int num : list){
//            for(int i=2;i*i<=num;i++){
//                if(num%i==0) {
//                    falseCount++;
//                    break;
//                }
//            }
//        }
//        int answer = list.size()-falseCount;

        int answer = 0;
        // 나는 여기서 소수인것을 카운트하고 싶다. :: 해결 <- 소수가 아닌것을 카운트하는 것은 가능
//        System.out.println(list);
        boolean flag=true;
        for(int num : list){
            for(int i=2;i*i<=num;i++){
                if(num%i==0) { // 소수아니면 flag=false, break;
                    flag = false;
                    break;
                }
                flag = true;
            }
            if(flag){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수만들기 p = new 소수만들기();
        int[] nums = {1,2,7,6,4};
        int answer = p.solution(nums);
        System.out.println("답 출력 : "+answer);
    }
}
