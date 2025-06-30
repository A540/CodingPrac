package lv_1.공원;

import java.util.*;

public class Solution {
    public int solution(int[] mats, String[][] park){
        int answer = -1;

        // mats 리스트 오름차 순 정렬
        Arrays.sort(mats);
        // 큰 매트 순 탐색을 위해 내림차 순 정렬
        for(int i = 0; i < mats.length / 2; i++){
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }

        // 매트 길이 별 자리 탐색 시작
        for(int matLength : mats){
            // 탐색
            for(int i = 0; i < park.length - matLength + 1; i++){
                for(int j = 0; j < park[i].length - matLength + 1; j++){
                    // 빈 칸 발견
                    if(park[i][j].equals("-1")){
                        boolean rest = true;
                        // 발견 자리로부터 매트 크기 만큼 탐색
                        for(int k = i; k < i + matLength; k++){
                            for(int g = j; g < j + matLength; g++){
                                // 자리가 없으면 break
                                if(!park[k][g].equals("-1")){
                                    rest = false;
                                    break;
                                }
                            }
                        }

                        // 매트 설치 가능 시 현 매트 크기 return
                        if(rest){
                            return matLength;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
