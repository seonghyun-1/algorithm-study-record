package programmers.week2;

/*
문제 : 기원이는 오늘 항해99를 시작했다. 성격이 급한 기원이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.
### 제한 조건
- 1 ≤ month ≤ 12
- 1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)
 */

public class 항해99신대륙발견 {
    public String solution(int month, int day) {
        // * 실행로직 *
        // 각 달의 일수를 나타내는 month배열을 만든다.
        // int addedDay에 98을 더한다.
        // 현재 month부터 계산한다.
        // while 반복문을 돌면서 현재 월에서부터 출발해서 배열의 최대일수만큼 빼준다.
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};//[n-1]은 n월
        int addedDay = day + 98;
        while(true){
            if(month>12) month = 1;
            if(addedDay-monthDays[month-1]<monthDays[month-1]){
                addedDay = addedDay-monthDays[month-1];
                month++;
                break;
            }
            addedDay = addedDay - monthDays[month-1];
            month++;
        }
        String answer = month+"월 "+addedDay+"일";
        return answer;
    }

    public static void main(String[] args) {
        항해99신대륙발견 method = new 항해99신대륙발견();
        int month = 1;
        int day = 18;
        System.out.println(method.solution(month, day));
    }
}
