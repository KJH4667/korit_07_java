package ch06_condition;
/*
상황 연산자
정의 : 조건식을 평가하여 true / false에 따라 두 가지 표현식 중 하나를 선택적으로 실행
형식 : 조건식 ? 표현식1 " 표현식2;

조건식: true / false로 평가 가능한 식
표현식1: 조건식이 true일 때 실행되는 식
표현식2: 조건식이 false일 때 실행되는 식
 */

import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int max;
//        // a > b 라면 max에 a를 대입 / 아니라면 max에 b를 대입
//        max = (a > b) ? a : b;
//        System.out.println("max에 저장된 값은?" + max);
//
//        //근데 만약에 이걸 상황 연산자가 아니라 앞에서 배운 if문을 쓴다고 가정한다면
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//            System.out.println("max에 저장된 값은?" + max); // 로그인 페이지 (프론트엔드)에 많이 쓰인다고 한다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하세요 >>>");
        int year = scanner.nextInt();
//        boolean isleapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
//        String result = isleapYear ? "윤년입니다" : "윤년이 아닙니다";
//
//        System.out.println(year + "년은" + result);

        //음수 연도를 걸러내기 위한 방법
        String result2 = "";
        boolean isleapYear2 = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        if (year < 0) {
            result2 = "불가능한 연도 입력입니다";
        } else {
            result2 = isleapYear2 ? "윤년입니다" : "윤년이 아닙니다";
        }
        System.out.println(year + "년은" + result2);


        //음수 연도를 걸러내기 위한 방법#2
        String result3 = year < 0 ? "불가능한 연도 입력입니다"
                : ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                ? "윤년입니다"
                : "윤년이 아닙니다.";

        // 얘를 만약에 if문으로 작성한다고 가정하면
        // 매력적이지 않은 예시
//        if (selectedNum < 1 || selectedNum > 6) {
//            System.out.println("불가능한 메뉴 선택입니다.");
//        } else {
//            if(selectedNum == 1) {
//                System.out.println("메뉴 1을 선택하셨습니다.");
//            } else if(selectedNum == 2) {
//                System.out.println("메뉴 2를 선택하셨습니다.");
//            } else if(selectedNum == 3) {
//                System.out.println("메뉴 3를 선택하셨습니다.");
//            } else if(selectedNum == 4) {
//                System.out.println("메뉴 4를 선택하셨습니다.");
//            } else if(selectedNum == 5) {
//                System.out.println("메뉴 5를 선택하셨습니다.");
//            } else {
//                System.out.println("메뉴 6을 선택하셨습니다.");
//            }
//        }

        //switch문 적용 사례
//        switch (selectedNum) {
//            case 1:
//                System.out.println("메뉴 1을 선택하셨습니다");
//                break;
//
//            case 2:
//                System.out.println("메뉴 2을 선택하셨습니다");
//                break;
//            case 3:
//                System.out.println("메뉴 3을 선택하셨습니다");
//                break;
//            case 4:
//                System.out.println("메뉴 4을 선택하셨습니다");
//                break;
//            case 5:
//                System.out.println("메뉴 5을 선택하셨습니다");
//                break;
//        }

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

        String selectedChar = scanner.nextInt();
        switch (selectedChar) {
            case "a":
                System.out.println("메뉴 1번을 선택하였습ㄴ디ㅏ");
            case "b":
                System.out.println("메뉴 2번을 선택하였습ㄴ디ㅏ");
            case "c":
                System.out.println("메뉴 3번을 선택하였습ㄴ디ㅏ");
            case "d":
                System.out.println("메뉴 4번을 선택하였습ㄴ디ㅏ");
            case "e":
                System.out.println("메뉴 5번을 선택하였습ㄴ디ㅏ");
            case "f":
                System.out.println("메뉴 6번을 선택하였습ㄴ디ㅏ");
        }

    }
}

