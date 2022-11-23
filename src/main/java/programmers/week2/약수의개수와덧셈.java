package programmers.week2;

import java.util.ArrayList;
public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        // * 실행계획 *
        // for문으로 left부터 right까지 순회하면서
        // for문 i가 주어졌을때 약수를 구해서 배열에 저장하고 카운트한다.
        // 카운트해서 짝수이면 int sum을 생성해서 더하고 홀수이면 sum에서 뺀다.

        // * 작성하면서 배운것 *
        // -- 어레이리스트 초기화(모두 null로 설정하고 size를 0으로 선언) : list.clear();
        // -- 어레이리스트 크기 : list.size();

        // * 코드작성 *
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=left;i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
//                    System.out.println("j:"+j);
                    list.add(j);
                }
            }
            System.out.println(list.size());
            if(list.size() % 2 == 0){
                sum = sum + i;
            } else {
                sum = sum - i;
            }
            list.clear();
        }
        int answer = sum;
        return answer;
    }

    public static void main(String[] args) {
        약수의개수와덧셈 sol = new 약수의개수와덧셈();
        int left = 13;
        int right = 17;
        int answer = sol.solution(left,right);
        System.out.println(answer);
    }
}
