package ch12_arrays;

/*
main에서 사용하는 불특정 String[]배열을 argument로 하는 매서드를 호출했을때 String[] 내부의 element들을 한줄로 출력하는 method를 정의하는것이 목표

다음 목표
main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을때 String[] 내부 element들의 값을 하나하나 다 입력받아서 바꾸는 method를 정의하는것


 */

import java.util.Scanner;

public class Array04 {
    // 메서드 정의 영역
    public void printElements() {
        String[] names = { "김일", "김이", "김삼", "김사", "김오", "김육" };

        for ( int i = 0 ; i < names.length ; i++ ) {
            System.out.print(names[i] + " ");
        }
    }

    public void printElements(String[] strArray) {
        for ( int i = 0 ; i < strArray.length ; i++ ) {
            System.out.print(strArray[i] + " ");
        }
    }

    public void printElements(int[] strArray) {
        for ( int i = 0 ; i < strArray.length ; i++ ) {
            System.out.print(strArray[i] + " ");
        } // public void printElements(int[] strArray) 이곳이 String[] 선언이 아니라 int[] 선언으로 바꿔줬다.
    }


    public static void main(String[] args) {
        // 메서드 호출 영역

        // method화 하기 위한 과정 # 1
        // 일단 main에서 해본다

        // 여기에 객체 생성하고 메서드 호출해서 김일 김이 ... 김육을 출력하시오.
        Array04 array04 = new Array04();
        array04.printElements();
        System.out.println();
        // 이상의 코드의 문제점은 메서드를 호출했을 때 특정 배열의 element만 출력된다는 점

        String[] students = {"이일", "이이", "이삼", "이사", "이오"};

        array04.printElements(students);
        System.out.println();
        String[] teachers = {"안일", "안이", "안삼", "안사"};
        array04.printElements(teachers);

        int[] dates = { 2025, 8, 5 };
        array04.printElements(dates);
    }
}
