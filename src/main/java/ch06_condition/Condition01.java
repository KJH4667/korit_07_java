package ch06_condition;
/*
1. if문 : if 다음에 있는 () 내의 조건식이 true일때 {}내의 실행문이 실행됨.
false면 실행 x

형식 : if(조건식) {  조건식 : true / false로 결론이 날 수 있는 식 또는 문장
실행문


2. if - else 문 : if다음에 있는 조건식이 true일 때는 if문 내의 {} 실행문이 실행 / false 인 경우에는 else에 딸린 {} 실행문이 실행
형식: if (조건식) {
실행문1
} else {        else의 경우 if가 false일 때만 실행되기 때문에
실행문2        if 에서 처럼 조건식이 존재하지 않습니다.
}
 */

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        //변수 선언 및 초기화
        int num1 = 10;

        //조건문 적용
        //실행되는 예시
        if (num1 > 0) {
            System.out.println("num1은 양수입니다");

            if (num1 > 15) {
                System.out.println("num1은 15초과 입니다");
            }

            //Scanner import
            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자를 입력하세요>>>");
            int num2 = scanner.nextInt(); // 그러면 실행하기 전까지 num2의 값을 모르겠네요

            if (num2 > 0) {
                System.out.println("num2는 양수입니다.");
            }
            System.out.println("프로그램 종료");

            // Condition02 생성하고 main 적용
        }
    }
}
