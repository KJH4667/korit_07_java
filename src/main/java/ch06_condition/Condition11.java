package ch06_condition;
/*
    switch 문. 자바에는 있지만 파이썬에는 없다...
    형식:
    switch(변수명)
    case 조건1:
    실행문1:
    break:
    case 조건2:
    실행문2
    break;
    case 조건3:
    실행문3
    break;
    default: > 위의 조건중에 무엇도 해당안되면, default가 진행된다.
    실행문4;
 */

import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedNum;

        System.out.println("[ 메뉴 선택 ]");
        System.out.println("1. Java를 공부한다");
        System.out.println("2. Python을 공부한다");
        System.out.println("3. JavaScript를 공부한다");
        System.out.println("4. HTML을 공부한다");
        System.out.println("5. 자습한다");
        System.out.println("6. 쉰다");
        System.out.println("메뉴를 선택하세요 >>>");
    }
}
