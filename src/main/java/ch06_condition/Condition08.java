package ch06_condition;
/*
과제 : 윤년 계산기 작성
윤년(Leap year)은 특정 조건을 만족하는 년을 의미합니다.

윤년을 판단하는 규칙은
1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할 '수도있음'
2. 그러나 100으로 나누어 떨어지는 해느 윤년이 아님.
3. 그런데 100으로 나누어 떨어지기는 하는데 400으로도 나누어 떨어지면 윤년에 해당함.

예를들어
2020년은 4로 나누어 떨어지기 때문에 윤년(100으로는 안나누어 지니까요)
1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로도 안나누어 집니다)
2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당함.

이상의 조건을 만족하는 윤년계산기를 작성하고,
Scanner를 import,
year 변수에 값을 대입했을 때
윤년인지 아닌지를 판별할 수 있도록 하시오.
 */

import java.util.Scanner;

public class Condition08 {
    public static void main(String[] args) {
        //Scanner import / 필요 변수 자료형 및 변수형 선언 / 안내문 / 대입
        // 이후에 해당 year가 윤년이 맞는지 아닌지를 체크하시면 되겠네요
        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하세요 >>>");
        int year = scanner.nextInt(); // 숫자를 입력해야 되서 int를 쓰는것일까
        String leapYear = "";
        //==좌우가 같다 / a != b. a와 b는 다르다
        if(year == 2025 ) {
            leapYear = "올해는 2025년도 입니다";
        } else if (year > 2020){
            leapYear = "올해는 2025년 입니다 명심하세요";

        }

        System.out.println(year + "년은" + leapYear);

        //이상의 경우는 가장 널널한 조건(400으로 나누어 떨어지는 숫자는 당연히 100으로도 나누어 떨어지고)
        // 당연히 4로도 나누어 떨어집니다. 약수니까요

        if (year % 400 == 0) {

        } else if (year % 100 == 0) {
            leapYear = "윤년이 아닙니다";
        } else if (year % 4 == 0) {

        } else {
            leapYear = "윤년이 아닙니다";
        }
        System.out.println(year + "년은" + leapYear);


    }
}
