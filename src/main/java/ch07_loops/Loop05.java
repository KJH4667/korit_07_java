package ch07_loops;
/*
중첩 for문도 가능합니다.
for (int i = 0 ; i < 100 ; i++) {
반복실행문 1-a
for(int j = 0 ; j < 100 ; j++) {
반복실행문2
}
반복실행문 1-b
}
for문을 활용하여 1일차 1교시 입니다. ~5일차 3교시 입니다. 까지를 출력하시오.
 */

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
//        for (int = i ; i < 6 ; i++) {
//            for(int = j ; j < 6 ; j++) {
//                System.out.println(i + "일차" + j + "교시입니다.");
//            }
//        }
//
//        for(int i = 2 ; i < 6 ; i++) {
//            for(int j = 1 ; i < 6 ; i++)

        //        for (int i = 1 ; i < 6 ; i++) {
//            for(int j = 1 ; j < 4 ; j++) {
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//        }
//
//        for (int i = 2 ; i < 10 ; i++) {
//            for(int j = 1 ; j < 10 ; j++) {
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//        } 이것 따로 실행해보기

        /*
        1 2 3 4 5 ... 10
        11 ... 20
        91 ... 100. for문을 사용해서?
         */

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");

            // 10개 출력 후 줄바꿈
            if (i % 10 == 0) {
                System.out.println();
            }
        }  // 이것은 챗gpt로 한것.

        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");

            // 10개 출력 후 줄바꿈
            if (i % 10 == 0) {
                System.out.println();
            }
        } // 이것은 강사님 답지. for문 안에 0부터~100이하까지, 1부터 101미만 까지 차이정도뿐이다.

        for (int i = 1; i < 101; i += 10) {
            System.out.println(i + " " + (i + 1) + " " + (i + 2) + " " + (i + 3) + " " + (i + 4) + " " + (i + 5) + " " + (i + 6) + " " + (i + 7) + " " + (i + 8) + " " + (i + 9));
        } // 이것도 강사님 답지.

        /*
        숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오.
        실행 예
        1부터 몇까지를 더하시겠습니까?>>>
        1부터 10까지의 합은 55입니다.



        위에거 다 하신분들은 1부터 10까지의 숫자중 짝수의 합도 도출하시오.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 몇까지를 더하시겠습니까?>>>");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다."); // 66~75까지 역시 gpt 썻다. 이해하기 전까지 복습 필수
    }

//    for (int i = 1; i <= n+1; i++) {
//        sum += i;
//    if (i % 2 == 0) {
//        sumEven += i; >> int sumEven = 0; 선언 위에 적어야 함. 일단 적지않고 여기 주석에 메모.
    //System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    //System.out.println("1부터 " + n + "까지중 복수의 합은 " + sumEven + "입니다.");
//    }
//    } >> 이것은 강사님 풀이

//        int sum2 = 0;
//        for (int i = 1; i < 10; i++) {
//            if (i % 2 == 0) {
//                sum2 += i;
//            }
        }
     // }}2개 추가됨


//Scanner scanner = new Scanner(System.in);
//        System.out.print("1부터 몇 까지 더하시겠습니까>>> ");
//int n = scanner.nextInt();
//int sum = 0;
//int sumEven = 0;
//int sumOdd = 0;
//        for (int i = 1 ; i < n+1 ; i++) {
//sum += i;
//            if (i % 2 == 0) {
//sumEven += i;
//            } else {
//sumOdd += i;
//            }
//                    }
//                    System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
//        System.out.println("1부터 " + n + "까지 중 짝수의 합은 " + sumEven + "입니다.");
//        System.out.println("1부터 " + n + "까지 중 홀수의 합은 " + sumOdd + "입니다.");
// 깃허브 강사님꺼 복사후 나중에 따로 복습.

