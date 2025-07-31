package ch07_loops;

/*
*
**
***
****
*****
로 만들어질 수 있도록 작성하시오.
다 하신분들은


***
**
*
 */

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.println("몇줄의 별을 생성하시겠습니까?>>>");
        row = scanner.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for ( int i = 0 ; i < row ; i++) {
            for ( int j = row ; j - 1 > 0 ; j--) {
                System.out.print("■");
            }
            System.out.println();
        }
    }
}
