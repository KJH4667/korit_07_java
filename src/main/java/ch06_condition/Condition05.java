package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
        사용자에게 sore를 입력받아 다음가 같은 조건을 만족시키도록 작성하시오.
        score가 90점 이상이라면 grade는 A
        score가 80점 이상이라면 grade는 B
        score가 70점 이상이라면 grade는 C
        score가 60점 이상이라면 grade는 D
        score가 50점 이하이라면 grade는 F




        실행 예
        점수를 입력하세요 >>> 68
        당신의 점수는 68점이고, 학점은 D입니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요>>> ");
        int point = scanner.nextInt();
        String userGrade = "";
        if (point > 90) {
            userGrade = "A";
        } else if (point > 80) {
            userGrade = "B";
        } else if (point > 70) {
            userGrade = "C";
        } else if (point > 60) {
            userGrade = "D";
        } else if (point <= 50) {
            userGrade = "F";
        }

        System.out.println("당신의 학점은 :" + userGrade); //이것은 내 스스로 푼것(챗gpt 활용)


//        Scanner scanner = new Scanner(System.in);
        int score = 0;
        double score2 = 0;
        String grade = "";
        System.out.println("점수를 입력하세요 >>>");
        score = scanner.nextInt();
        if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "c";
        } else if (score > 59) {
            grade = "d";
        } else {
            grade = "F";


        }
        System.out.println("당신의 점수는" + score + "점이고, 학점은" + grade + "입니다.");
    }
}
