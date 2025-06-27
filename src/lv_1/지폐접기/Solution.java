package lv_1.지폐접기;


public class Solution {
    public int solution(int[] wallet, int[] bill){
        int answer = 0;

        // 지갑, 지폐 크기 기준 정렬
        int walletMax = Math.max(wallet[0], wallet[1]);
        int walletMin = Math.min(wallet[0], wallet[1]);
        int billMax = Math.max(bill[0], bill[1]);
        int billMin = Math.min(bill[0], bill[1]);

        // 각 큰 길이, 작은 길이 비교 후 지폐가 크면 반 접기
        while(billMax > walletMax || billMin > walletMin){
            int tmp = 0;
            billMax /= 2;
            // 이후 지폐 크기 기준 재정렬
            if(billMin > billMax){
                tmp = billMin;
                billMin = billMax;
                billMax = tmp;
            }
            // 접은 횟수 +1
            answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] wallet = {30, 15};
        int[] bill = {26, 17};

        System.out.println("result : " + solution.solution(wallet, bill));
    }
}
