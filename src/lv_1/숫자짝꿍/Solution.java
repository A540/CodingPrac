package lv_1.숫자짝꿍;

public class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        // 등장한 숫자 갯수 카운트
        for(int i=0; i<X.length();i++){
            x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
            y[Y.charAt(i)-48] += 1;
        }

        // 공통되게 등장한 숫자 만큼 해당 숫자 append
        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }

        // 예외 처리
        // 공통된 숫자가 존재하지않음
        if("".equals(answer.toString())){
            return "-1";
        // 공통된 숫자가 0
        }else if(answer.toString().charAt(0)==48){
            return "0";
        }else {
            return answer.toString();
        }
    }
}
