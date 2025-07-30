package ch03_opertator;
/*
논리 연산자

true(1) / false (0): 컴푸터에 읽을수 있는 두숫자
boolean: true / false를 구분할수있는 자료형

AND(&&): 곱하기 연산자 T X T =T / T X F =F / F X F = F
OR(II): 합 연산자  T + T = T / T + F = T / F + F = F
NOT(!): TRUE 값을 FALSE로 변경.

 */

public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("----&& 연산자----");
        boolean result1 = flag1 && flag1;
        System.out.println("T x T =" +result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x T =" +result2);
        boolean result3 = flag2 && flag2;
        System.out.println("T x T =" +result3);
        // 연산자 부분은 result 4,5,6으로 작성하시오
        boolean result4 = flag1 || flag1;
        boolean result5 = flag1 || flag2;
        boolean result6 = flag2 || flag2;

        // ch04_scanner -> Scanner01

    }
}
