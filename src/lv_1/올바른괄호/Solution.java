package lv_1.올바른괄호;

import java.util.Scanner;

public class Solution {
    static int pt = 0;
    static char[] stack = new char[100000];

    public static void push(char pat){
        pt++;
        stack[pt] = pat;
    }

    public static char pop(){
        if(pt == 0){
            return '0';
        }
        return stack[pt--];
    }

    public static boolean solution(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                push(s.charAt(i));
            }

            if(s.charAt(i) == ')'){
                char a = pop();
                if(a == '0'){
                    return false;
                }
            }
        }
        return pt == 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("괄호 문자열 입력 : ");
        String s = sc.nextLine();

        System.out.println("result : " + solution(s));
    }

}
