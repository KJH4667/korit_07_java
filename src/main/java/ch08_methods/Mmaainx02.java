package ch08_methods;
/*
임의의 파일. 나중에 삭제예정 . 연습용
 */

public class Mmaainx02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // 여기 대괄호 { 작성 빼먹으면 안된다. 하나라도 빼먹으면 별이 원하는 모양으로 안찍힌다;
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
