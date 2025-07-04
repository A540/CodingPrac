package lv_1.데이터분석;

import java.util.*;

public class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extNum = switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 4;
        };

        int sort_byNum = switch (sort_by) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 4;
        };

        int j = 0;
        for (int[] datum : data) {
            if (datum[extNum] < val_ext) {
                data[j] = datum;
                j++;
            }
        }
        int[][] answer = new int[j][data[0].length];
        for(int i = 0; i < j; i++){
            answer[i] = data[i];
        }

        Arrays.sort(answer, new Comparator<int[]>(){
           @Override
           public int compare(int[] o1, int[] o2) {
               return o1[sort_byNum] - o2[sort_byNum];
           }
        });

        return answer;
    }
}
