package challenge;

public class Triangular {
    public void solution(int lines) {

        // # 실행계획
        // 0이 주어졌을때는 아무것도 찍지 않는다.
        // 1이 주어졌을때는 1번째 줄에 2n-1 -> 1개를 찍는다.
        // 2가 주어졌을때는 2번째 줄에 2n-1 -> 3개를 찍는다.
        // 3이 주어졌을때는 3번째줄에 총 별 5개를 찍는다. 2n-1
        // 6일 주어졌을때는 6번째줄에 총 별 11개를 찍는다. 2n-1

        // 만약 lines가 0이라면 아무것도 찍지 않고 break한다.
        // int widthAllStar = (2*line)-1;을 수행해서 가로의 총 별의 갯수를 설정한다.
        // 바깥에서 for문은 lines만큼 순회하면서
        // widthAllStar/2를 수행한다.
        // # 경우 lines가 홀수: lines가 3일경우, widthAllStar는 5이다.
        // widthAllStar/2, 5/2로 나누면 = 2가 나온다. 중앙의 2부터 별을 찍어야한다.
        // 이 경우, 인덱스 i가 0일때는 안쪽 포문에서 for(int j=2-i;j<=2-i;j++)만큼 수행하면서 j를 tmp어레이리스트에 저장해야한다
        // 먼저, for문 바깥에서 String show를 선언해준다.
        // 만약 i가 0일때 j의 범위가 2-0 과 2+0사이에 있으면 "*"을 show에 더해준다. 2-0 < j <=2+0
        // 만약 i가 1일떄 j의 범위가 2-1 과 2+1사이에 있으면 "*"을 show에 더해준다.
        // 즉, if(j > 2-i && j <= 2+i)일떄 "*"을 show에 더해주고
        // else " "을 show에 더해준다.
        // # 경우 lines가 짝수: lines가 4일경우, widthAllStar는 7이다.
        // widthAllStar/2는 7/2 = 3이다. 즉 짝수는 연산에 영향을 미치지 않는다.

        // 정리해보자.
        // 먼저 lines가 0이라면 ""를 출력해주고 return; 으로 종료한다.
        // int widthAllStar=(2*line)-1를 통해서 전체 가로길이를 구해준다. -> for문에서 사용된다.
        // 바깥 for문을 선언한다. for(int i=0;i<lines;i++) 까지 돌면서 총 라인수만큼 순회한다.
        // for문 바깥에서 int center = widthAllStar/2를 구한다.

        // 그리고 다시 안쪽 for문을 선언한다. for(int j=0;j<widthAllStar;j++) 가로로 별을 찍는 작업을 수행한다.
        // 이 안에서
        //      만약 j가 center-i와 center+i사이(<=)에 있다면, (for문 바깥에 다시 String showStar를 선언한다.) showStar에 "*"를 더해준다.
        //      else라면 showStar에 " "를 더해준다.
        // 안쪽 for문이 끝나면 showStar를 출력해주고 showStar를 ""초기화시켜준다.

        // # 푼시간 : 50분
        // # 에러를 만난횟수 : 0번

        // 코드작성
        if(lines == 0) {
            System.out.println("");
            return;
        }

        int widthAllStar=(2*lines)-1;
        int center = widthAllStar/2;
        String showStar;
        for(int i=0;i<lines;i++){
            showStar="";
            for(int j=0;j<widthAllStar;j++){
                if(j>=center-i && j<=center+i){
                    showStar = showStar + "*";
                } else {
                    showStar = showStar + " ";
                }
            }
            System.out.println(showStar);
        }

    }

    public static void main(String[] args) {
        Triangular method = new Triangular();
        int star = 3;
        method.solution(star);
    }
}
