package ch06_condition;

/*
중첩 if문(Nested - if)
if문 내에 if문이 중첩적으로 사용될 수 있습니다.

형식:
if(조건식1) {
실행문1
if(조건식a) {
실행문a
} else if(조건식 1b) {
실행문 1b
} else if(조건식1c) {
} else {
실행문 1d
}
}else if(조건식2) {
실행문2
if(조건식2a){
실행문 2a
} else if (조건식2b) {
실행문 2b }
else {
실행문 2c}
} else { 실행문3
}
 */

import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        String grade = "";
        System.out.println("점수를 입력하세요 >>>");
        score = scanner.nextInt();
        if(score > 100 || score < 0) {
            System.out.println("불가능한 점수입력 입니다");

            grade = "X";
        } else {
            if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else   {
                grade = "X";


            }
        }


    }
}
