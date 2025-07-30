package ch06_condition;
/*
고민해봐야 할 사항
Condition05의 코드는
100초과 / 0미만의 점수가 입력됐을 때 각각 A / F라는 결과값이 나오게 됩니다.
애초에 잘못된 점수를 입력했을때 불가능한 점수 입력이라고 안내를 하려면 어떻게 할수 있을까요?
100초과 / 0미만의 경우 grade 를 X라고 하겠습니다.

참고사항: 선수학습 하신 분들은 중첩 if문을 사용하지않고 작성하겠습니다.
 */

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요 >>>");
        int score = scanner.nextInt();
        String grade = "";

        score = scanner.nextInt();
        if (score > 100 || score < 0) { //얘가 false라면 score는 0점 이상이면서 100점 이하
            grade = "A";
        } else if (score > 79) {
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

