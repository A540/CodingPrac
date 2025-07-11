package lv_1.n3타일링;

import java.util.Scanner;

public class Solution {
    public static long solution(int n){
        long answer = 0;
        long[] tiles = new long[n + 1];
        tiles[2] = 3;

        for(int i = 4; i <= n; i += 2){
            tiles[i] = tiles[i - 2] * tiles[2] + 2;

            for(int j = 2; j <= i - 4; j += 2){
                tiles[i] += tiles[j] * 2;
            }

            tiles[i] %= 1000000007;
        }
        answer = tiles[n];

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
