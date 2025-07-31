package ch07_loops;
/*
Nested for - loop
for(시작값 ; 한계값 ; 증강값) {
반복실행문 1-a
for(시작값; 한계값; 증강값;) {
반복실행문2
} 반복실행문 1-b
for(시작값; 한계값; 증강값;) {
반복실행문3
}
반복실행문 1-c
}
*
**
***
****
*****
고려 사항
반복은 몇 번 이루어지는가?
무엇을 기준으로 반복이 이루어졌다고 판단할 수 있나?
왜 라인마다 별의 갯수가 달라지는가?
 */

public class Loop06 {
    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*"); // 처음에 이걸 System.out.println("*") 으로 하게되니깐 세로로 나열되었다...
//            }
//            System.out.println();
//        }
        /*
        별 찍기를 통한 for문 구조 학습
        i = 0, j = 0 일 때는 두 번째 for문이 작동 안하기 때문에 개행만 이루어지고 별x
        * i = 1, j = 0일 때 별 하나 찍히고, i = 1 / j =1일때 false
        ** i = 2, j = 0, 1일때 별이 두개
        *** i = 3
        **** i = 4
        ***** i = , j = 0, 1, 2, 3, 4까지 5개의 별이 찍히고 종료 되고 나서 개행이 이루어지기 때문에



        (문제)
        *****
        ****
        ***
        **
        *

         */

        //1. 개행을 담당하는 것이기 때문에 굳이 5 4 3 2 1로 가야되나...

//        for( int i = 5; i < 5; i++) {
//            for( int j = 5; j - i; j--) {
//                System.out.print("★"); // 강사님 풀이
//            }
//            System.out.println();

//        for( int i = 5; i > 0; --i) {
//            for( int j = 0; j < i; ++j) {
//                System.out.print("*"); // 챗gpt로 --i 개념을 알게됨.
//            }
//            System.out.println();
//        }
//
//    }

        //번외 문제 -> 100부터 1까지 역순으로 출력하시오
//        for (int i = 100; i > 0; i--) {
//            System.out.print("*");
//        }

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//2. i가 5부터 시작해서 좁히는 방법
//window + . -emoji 사용 단축키


