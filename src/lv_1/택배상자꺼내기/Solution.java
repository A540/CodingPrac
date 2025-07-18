package lv_1.택배상자꺼내기;

import java.util.*;

public class Solution {
    public static ArrayList<Integer> stackBox(int n, int w){
        ArrayList<Integer> boxList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if((i / w) % 2 == 0){
                boxList.add(i + 1);
            }
            else{
                for(int j = 1; j <= w; j++){
                    boxList.add(i + w - j + 1);
                }
                i = i + w -1;
            }
        }

        return boxList;
    }

    public int solution(int n, int w, int num){
        int answer = 0;
        ArrayList<Integer> boxList = stackBox(n, w);

        int index = boxList.indexOf(num);

        for(int i = index; i <= boxList.size(); i+=w){
            answer++;
        }

        return answer;
    }


    public static void main(String[] args){
        System.out.println(stackBox(13, 3));
    }
}
