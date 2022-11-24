package challenge;

public class 윷놀이 {
    public String count(int num){
        switch (num) {
            case 0:// 0이 4개일때
                return "윷";
            case 1:// 1이 1개일때
                return "걸";
            case 2:// 1이 2개일때
                return "개";
            case 3:
                return "도";
            case 4:
                return "모";
            default:
                return "에러";

        }
    }

    public String solution(int[] arr1) {
        // 코드 작성
        int count_one=0;
        for(int num : arr1){
            if(num == 1) count_one++;
        }
        return count(count_one);
    }

    public static void main(String[] args) {
        윷놀이 method = new 윷놀이();
        int[] arr1 = {1,1,1,1};
        System.out.println(method.solution(arr1));
    }
}