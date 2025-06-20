package lv_0.PCCE.각도합치기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int angel1 = sc.nextInt();
        int angel2 = sc.nextInt();

        int angelSum = angel1 + angel2;
        System.out.println(angelSum % 360);
    }
}
