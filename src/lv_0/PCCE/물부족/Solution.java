package lv_0.PCCE.물부족;

public class Solution {
    private int solution(int storage, int usage, int[] change){
        int total_usage = 0;
        for(int i = 0; i < change.length; i++){
            usage = (usage * change[i] / 100) + usage;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
