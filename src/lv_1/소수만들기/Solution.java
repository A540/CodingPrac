package lv_1.소수만들기;

public class Solution {
    public static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int solution(int[] nums){
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int result = nums[i] + nums[j] + nums[k];
                    System.out.println(result);
                    if(isPrime(result)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(solution(nums));
    }
}
