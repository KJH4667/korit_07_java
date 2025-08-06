package ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        String[] persons = {" 1번 : 김일", " 2번 : 김이", " 3번 : 김삼", " 4번 : 김사", " 5번 : 김오",};
        /*
        실행 예
        1 번 : 김일
        2 번 : 김이
        3 번 : 김삼
        ...
        5번 : 김오
        라고 출력될 수 있도록 일반 for문
        향상된 for문으로 작성하시오.
         */
//        for ( int i = 0 ; i < persons.length ; i++ ) {
//            System.out.println((i+1) + );
//        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        System.out.println();
        // 향상된 for 문

        for (String person : persons) {
            System.out.print("번 : " + person);
        }
    }
}
