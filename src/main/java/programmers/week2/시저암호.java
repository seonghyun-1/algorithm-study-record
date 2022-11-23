package programmers.week2;

public class 시저암호 {
    public String solution(String s, int n) {

        // # 실행계획
        // String s를 순회하면서 각 캐릭터별로 아스키값을 인식하여 소문자일때와 대문자일때와 소문자나 대문자가 아닐때로 나눈다.
        // 소문자와 대문자의 각 경우에서 문자의 아스키 값에 n으로 더해진 값이 최대값을 넘으면 최대값만큼 아스키값을 뺀 후 뺸 값을 (최소값-1)에 더한다.
        // 이렇게 해서 얻게 된 아스키값을 이용해서 캐릭터로 변환하여 문자열에 더해준다.
        // 소문자나 대문자가 아닐 때는 String s에 그대로 더해준다.

        // 이렇게 하면 안되나 헷깔림 왜냐면 0~25의 값이 나오는데 아래서 64에다가 n을 더해주게 됨 이러면 하나가 밀려서 출력됨
        // 초과시 64를 더해주는게 맞나? ㅇㅇ 64를 더해주는게 맞음(n의 범위가 1 ~ 25일때)
        // 'Z' + 1 -> 'A'(65) = 64 + 1
        // 'Z' + 2 -> 'B'(66) = 64 + 2
        // 'Z' + 25 -> 64 + 25 = (89)'Y'

        // # 아스키 코드값 추출
        //System.out.println((int)"a".charAt(0)); // 97
        //System.out.println((int)"z".charAt(0)); // 122
        //System.out.println((int)"A".charAt(0)); // 65
        //System.out.println((int)"Z".charAt(0)); // 90

        // # 코드작성
        n = n % 26;
        int addedNum;
        String addStr = "";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) < 65 || s.charAt(i) > 122) {
                addStr = addStr + s.charAt(i);
                continue;
            }

            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                addedNum = (int)s.charAt(i) + n;
                if(addedNum > 90) {
                    addedNum = addedNum - 90 + 64;
                    addStr = addStr + (char)addedNum;
                } else {
                    addStr = addStr + (char)addedNum;
                }
            } else if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                addedNum = (int)s.charAt(i) + n;
                if(addedNum > 122) {
                    addedNum = addedNum - 122 + 96;
                    addStr = addStr + (char)addedNum;
                } else {
                    addStr = addStr + (char)addedNum;
                }
            }
        }
        String answer = addStr;
        return answer;
    }

    public static void main(String[] args) {
        시저암호 sol = new 시저암호();
        String s = "a B z";
        int n = 23;
        String answer = sol.solution(s,4);
        System.out.println(answer);
    }
}
