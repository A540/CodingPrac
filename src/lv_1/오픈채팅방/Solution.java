package lv_1.오픈채팅방;

import java.util.*;

public class Solution {
    static List<String[]> userList = new ArrayList<>();

    public static String enterUser(String userId){
        String answer = "";
        for(String[] user : userList){
            if(userId.equals(user[0])){
                answer = user[1] + "님이 들어왔습니다.";
            }
        }
        return answer;
    }

    public static String leaveUser(String userId){
        String answer = "";
        for(String[] user : userList){
            if(userId.equals(user[0])){
                answer = user[1] + "님이 나갔습니다.";
            }
        }
        return answer;
    }

    public static void changeNickname(String userId, String nickname){
        for(String[] user : userList){
            if(userId.equals(user[0])){
                user[1] = nickname;
                return;
            }
        }
        userList.add(new String[]{userId, nickname});
    }

    public String[] solution(String[] record){
        String[] answer = {};

        List<String> result = new ArrayList<>();

        for(String sentence : record){
            String[] words = sentence.split(" ");
            if(words[0].equals("Change") || words[0].equals("Enter")){
                changeNickname(words[1], words[2]);
            }
        }

        for(String reco : record){
            String[] data = reco.split(" ");
            if(data[0].equals("Enter")){
                result.add(enterUser(data[1]));
            }
            if(data[0].equals("Leave")){
                result.add(leaveUser(data[1]));
            }
        }

        answer = result.toArray(new String[result.size()]);

        return answer;
    }
}
