package ch06_condition;

import java.util.Scanner;

/*
if - else if - else 문
형식 : if(조건식1) {
실행문1
} else if(ㅈ건식2) {
실행문 2
} else if(ㅈ건식3) {
실행문 3 {
else if(ㅈ건식4) {
실행문 4
 */
public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("인트를 입력하세요>>> ");
        int point = scanner.nextInt();
        String userGrade = "";
        if (point > 80) {
            userGrade = "VIP";
        } else if (point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20) {
            userGrade = "BRONZE";
        }

        System.out.println("회원등급 : " + userGrade);
        /*
        if - else의 경우 if 내의 조건식이 false라면 바로 else의 실행문이 실행디는데 반해 ,
        if - else if - else의 경우에는 else 위의 조건식들을 '례댈' 검ㅌ한 후에, 그 무엇ㄷ 해당디지 않으면 else 의 실행문이 실행딥니다.

        그렇다면 개발자들이 신경써야 하는 점이 무엇인가?

        조건식의 순서를 설정하는 부분이 딥니다.

        Condition05

         */

    }
}
