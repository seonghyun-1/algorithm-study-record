package programmers.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class 숫자문자열과영단어 {

    public String turnWordIntoString(String wordNum){
        switch(wordNum){
            case "zero":
                return "0";
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            default:
                return wordNum;
        }
    }
    public int solution(String s) {
        // # 필요한 개념 및 알고리즘 예측
        // ## 아스키코드 a ~ z : 97 ~ 122 / 숫자 0 ~ 9 : 48 ~ 57
        // (int)s.charAt(i) => 아스키코드 추출
        // System.out.println((int)"0".charAt(0));
        // System.out.println((int)"9".charAt(0));
        // ## StringBuilder 사용법


        // # 실행계획
        // 각 문자에 접근해서 아스키코드를 보고 문자열과 숫자를 구분해서 배열로 각각 저장한다. -> StringBuilder 사용안함 / ArrayList 사용
        // 저장된 ArrayList를 순회하면서 숫자로된 문자는 숫자로 형변환시키고 문자로 된 숫자는 메소드를 만들어서 처리한다.
        // => 메소드 : 문자로 된 숫자를 정수타입 숫자로 변환시키는 메소드는 switch문으로 만들어서 작성한다. -> 다른 방법이 있는지 확인
        // 저장된 ArrayList는 문자열로 변형시킨다.
        // 숫자로 이뤄진 문자열을 answer에 int형으로 변환시켜서 저장한다. 그리고 제출한다.


        // # 풀면서 알게된것
        // ## ArrayList<String>으로 선언하고 s.charAt(i)으로 저장하면
        //    Character를 String에 저장하려고 해서 오류가 발생한다. -> substring으로 대체해서 문제풀이수행
        // ## String s = "string" + s.charAt(i); 를 하면 자동형변환이 일어나서 오류가 발생하지 않는다.
        // ## String 비교해서 값이 같으면 true 반환하기 : s1.equals(s2);
        // ## String을 int로 변환 : Integer.parseInt(str);

        // # 코드작성
        // ## 배열만들기
        // ### 포문으로 캐릭터순회를 한다.
        // ### 48 ~ 57사이에 있으면 숫자로 바로 어레이리스트에 저장한다.
        // ### 97 ~ 122사이에 있으면 문자가 시작되는 구간부터 캐릭터 덧셈을 수행한다.
        //     String tmpStr = ""을 선언하고 a~z 사이의 단어를 계속해서 더해나간다.
        //     그리고 만약 현재 i가 s.length()-1이면 tmpStr을 저장한다.
        //     또 만약 i+1이 아스키값으로 48 ~ 57사이에 있으면 tmpStr을 저장하고 tmpStr을 ""로 초기화한다.
        //     또 만약 tmpStr.length()>=3인 경우에 tmpStr을 영단어가 저장된
        //        배열과 비교해서 일치하면 tmpStr에 저장하고 tmpStr을 ""로 초기화한다.

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> answerList = new ArrayList<>();
        String tmpStr = "";
        String[] checkWord = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57){
                list.add(s.substring(i,i+1));
            } else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                tmpStr = tmpStr + s.charAt(i);
                if(i==s.length()-1) {
                    list.add(tmpStr);
                    break;
                }
                if(s.charAt(i+1)>=48 && s.charAt(i+1)<=57){
                    list.add(tmpStr);
                    tmpStr = "";
                }
                if(tmpStr.length()>=3){
                    flag = false;
                    for(int j=0;j<10;j++){
                        // 스트링비교
                        if(checkWord[j].equals(tmpStr)) {
                            flag = true;
                            break;
                        }
                    }
                    if(flag) {
                        list.add(tmpStr);
                        tmpStr = "";
                    }
                }
            }
        }
        System.out.println(list);

        // 만들어진 배열을 숫자형 스트링 배열로 변환한다
        String tmp = "";
        for(String num : list){
            tmp = turnWordIntoString(num);
            answerList.add(tmp);
        }
//        System.out.println(answerList);

        // 배열을 문자열로 변환해서 합치는 메소드를 사용한다.
        String strAnswer = String.join("",answerList);
//        System.out.println(strAnswer);


        int answer = Integer.parseInt(strAnswer);
        return answer;
    }

    public static void main(String[] args) {
        숫자문자열과영단어 p = new 숫자문자열과영단어();
        String s = "one4seveneight";
        int answer = p.solution(s);
        System.out.println("정답:"+answer);
    }
}
