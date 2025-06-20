package lv_0.PCCE.심폐소생술;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for (int i = 0; i < cpr.length; i++) {
            for (int j = 0; j < basic_order.length; j++) {
                if (cpr[i].equals(basic_order[j])) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cpr = sc.nextLine().split(" ");
        Solution sol = new Solution();
        int[] answer = sol.solution(cpr);
        System.out.println(Arrays.toString(answer));
    }
}
