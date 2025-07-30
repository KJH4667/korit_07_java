package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //변수선언
        String name;
        name = "권장후";
//        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>>");
//        name = scanner.nextLine();

        /*
        1. println 와 print의 차이
        ln: line new -> println 으로 실행하면 출력문이 다 나오면 자동으로 개형됨
        print로 작성할 경우에 동일 라인에 그대로 연결됨.

        2. nextLine / nextInt / 어쩌고 저쩌고 이런것들이 있겠다. 구분해야 겠다.
         */
        System.out.print("연도를 입력하세요. >>>");
        int YEAR = scanner.nextInt();
        System.out.println("이름을 입력하세요. >>>");
        name = scanner.next();  //입력을 KJH
        System.out.println(name);
        /*
         nextInt / Double, ... etc) vs. nextLine
         -nextLine은 띄어쓰기를 허용합니다.
         -> 그래서 24번 라인 실행결과 KJH 였습니다.
//         */
        System.out.print("올해는 몇년도 인가요?");
        int year = scanner.nextInt();
        System.out.println("당신의 이름은? >>>");
        System.out.println("연도:" + year);
        System.out.println("이름:" + name);

        /*
         이상의 코드에서의 문제점은 34번 라인이 실행됬을때 데이터를 입력받지 않고 그대로 넣어간다는 점입니다.
         왜 이런 문제가 생기냐면 nextInt()에서 값을 입력하고 저희가 enter를 치게 되는데
         */

//        System.out.print("올해는 몇년도 인가요?");
//        int year = scanner.nextInt();

        scanner.nextLine();     //베리어 역할을 하는 nextLine()

        //되지 않을거니깐 변수에 대입하지 않습니다.


//        System.out.println("당신의 이름은? >>>");
//        System.out.println("연도:" + year);
//        System.out.println("이름:" + name);

        /*
        1. 다음과 같은 콘솔에 출력할수 있도록 코드를 작성하시오.
        나이를 입력하세요 >>> 19
        */
//        System.out.println("나이를 입력하세요");
//        int age = scanner.nextInt();
//        System.out.println("저는 올해" + age + "살 입니다");
//        System.out.println();



        /*
        저는 올해 19살 입니다.
        내년에는 20살이 됩니다.


        2. 다음과 같이 콘솔에 출력될수 있도록  코드를 작성하시오.
        점수를 입력하세요 >>> 4.6
        이름을 입력하세요 >>> 김일
        김일 학생의 점수는 4.5입니다.
         */

    }
}
