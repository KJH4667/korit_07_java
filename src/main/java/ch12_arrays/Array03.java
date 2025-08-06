package ch12_arrays;
/*

실행 예
몇 명의 학생을 등록하시겠습니까?>>> 5
1 번 학생의 이름을 등록하세요 >>> 김일
김일 학생의 점수를 입력하세요 >>? 4.5
2 번 학생의 이름을 등록하세요 >>> 김이
김이 학생의 점수를 입력하세요 >>? 4.4
3 번 학생의 이름을 등록하세요 >>> 김삼
김삼 학생의 점수를 입력하세요 >>? 4.3
4 번 학생의 이름을 등록하세요 >>> 김사
김사 학생의 점수를 입력하세요 >>? 4.2
5 번 학생의 이름을 등록하세요 >>> 김오
김오의 점수를 입력하세요 >>? 4.1


2. scores 배열에 점수를 입력할수 있도록 할겁니다.
1 번 학생의 점수를 입력하세요 >>? 4.5
2 번 학생의 점수를 입력하세요 >>? 4.4
3 번 학생의 점수를 입력하세요 >>? 4.3
4 번 학생의 점수를 입력하세요 >>? 4.2
5 번 학생의 점수를 입력하세요 >>? 4.1


김일 김이 김삼 김사 김오
4.5 4.4 4.3 4.2 4.1

학생들의 점수 총점은 21.5점 입니다.

 */

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 사용할 외부 클래스 import
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 목록
        int index = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        index = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[index];
        double[] scores = new double[index];
        double sum = 0;
        // 하나의 반복문 내에서 두 개의 배열에 데이터를 대입할 필요가 있음
        for( int i = 0 ; i < index ; i++ ) {
            System.out.println((i + 1) + "번 학생의 이름을 입력하세요.>>>");
            names[i] = scanner.nextLine();
            System.out.println(names[i] + "학생의 점수를 입력하세요. >>>");
            scores[i] = scanner.nextDouble();
            System.out.println(names[i] + "학생의 점수를 입력하세요. >>>");
            scanner.nextLine(); // 바로 위에 nextDouble() 다음에 i++ 이후 nextLine()이 배치될 예정이라 배리어 위치가 여기
            sum += scores[i];
        }

        for( int i = 0 ; i < index ; i++ ) {
            System.out.print(scores[i]);
        }
    }
}
