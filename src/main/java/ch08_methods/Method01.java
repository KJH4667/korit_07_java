package ch08_methods;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
Java 에서는 함수(function)의 개념과 동일함.
JavaScript / Python에서는 Function / method의 개념이 분리되어 있으나 Java는 모든 함수가 클래스에 종속되어 있기

function vs method

근데 그러면 용어를 왜 분리하는가?

-기본적으로 클래스 내부에 함수를 정의하게 되면 이를 '매서드' 라고 합니다.
Java는 모든 함수들이 특정 클래스에 종속돼있기 때문에 전부 다 매서드에 해당됩니다.

그래서 다른 언어를 배우게 된다면 '함수의 호출 방식'과 '메서드의 호출방식' 상에서의 차이가 존재하지만, 현재 저희 수업을 기준으로는 전부 다
method에 해당하고, 이에 따라서 제가 Java수업 중인데 갑자기 함수 어쩌고하면 그냥 메서드라고 알아들으시면 됩니다.

하지만 추후에 차이가 생깁니다.

##용어정리
1. method 정의 (def - define) : 사용자가 매서드를 새로 만드는 것을 의미
2. method 호출(Call) : 만들어진(미리 만들어진) 메서드르 실행시키는 것을 의미
3. 매개변수(parameter) : 특정 메서드에 필수적으로 요구되어지는 변수
4. 출력값 / 결과값 / 리턴값 (return) : 메서드의 호충결과 생성되는 자료(없을 수도 있음)
5. 인수 / 인자(argument) : 사용자가 메서드에 전달하는 입력(input)

## Java 상에서의 method
예를 들어, '사진을 찍는다' 라는 행위에 대해서
1. 주머니에서 폰을 꺼내고
2. 잠금 화면을 풀고
3. 카메라를 켜고
4. 사진을 찍고자 하는 대상에 폰을 조준하고,
5. 셔터를 누른다
라는 과정이 존재합니다.
그런데 제가 어제 설명했듯이 컴퓨터는 생각보다 너무 멍청 하기 때문에 '사진을 찍느다' 라고 명령을 내리는 것으로 충분하지 않고, 1~6까지의 명령어 순서대로
입력해줘야만 합니다. 하지만 매번 이렇게 하는것이 번거롭기 때문에 우리는 '사진을 찍는다' 라는 일련의 동작을 하나의 메서드로 이름 붙이고, 그 내부에
1~6까지의 명령어를 미리 입력해두는 과정을 거치게 되는데, 이를 메서드 '정의'라고 합니다.

그리고 실제로 컴퓨터에게 '사진을 찍는다' 라는 명령을 내리게 되는것을 메서드 '호출'이라는 표현이 됩니다.

그리고 여러분의 폰이 아이폰인지 안드로이드폰인지에 따라서 잠금화면을 푸는 방식 등이 달라지겠죠.
그래서 특정한 폰을 지니고 있음을 컴퓨터에게 알릴 필요가 있을 겁니다. 이를 argument 라고 할 수 있습니다. 그리고 사진 찍으면 사진 결과물이 남겠죠.
이것이 return에 해당하는 것이라고 볼 수 있겠습니다.
 */

public class Method01 {
    //아직 main은 만들지 않는다
    /*
    여기에 메서드를 정의할 예정입니다. 이번 수업 이후부터는 꼭 main을 치지 않는 경우도 있다는점을 아시면 되겠습니다.
     */

    // 1. [ x | x ] [ 입력값 | 출력값 ]
    public static void call1()  {
        System.out.println("[ x | x ]");
//        System.out.println("똑같은말");
    }

    // 2. [ o | x ]
    public static void call2(String example) {
        System.out.println("[ o | x ]");
        System.out.println("영어 인사 : " + example);
    }

    //3. [ x | o ]
    public static String call3() {
        String example = "안녕하세요";
        System.out.println("[ x | o ]");
        return example;
    }

    public static int call3And1() {
        int example = 1;
        System.out.println("[ x | o ]");
        return 1;
    }

    // 4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3학점짜리 입니다.");
        return score * 3;
    }

    /*
     return이 있는 이유는 기본적으로 데이터의 조작을 위해서입니다. 그리고 특정 메서드의 결과값이 다른 메서드의 argument로 사용될 수도 있습니다.
     함수형 프로그래밍(Functional Programing) :"
     메서드1의 return 값이 메서드2의 argument가 되고, 메서드2의return 값이 메서드3의 argument가 되는 방식으로,

     첫번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 코딩방식

     간단 예시
     */

    public static String introduce(String name, int age) {
        return "제 이름은" + name + "이고, 나이는" + age + "살 입니다. \n내년에는" +(age + 1)+ "살이 됩니다.";
    }

    public static void main(String[] args) {
        //매서드 호출 영역
        call1();
        call2("hello");
        call3();
        call3And1();

        // return값을 출력하기 위해서는
        System.out.println(call3()+ "!");
        String name = "김일";
        System.out.println(call4(4.5));
        System.out.println(name + "학생의 학점은 " + call4(4.5) + "점입니다.");

        Scanner scanner = new Scanner(System.in);
        String myName = "";
        int myAge = 0;
        System.out.println("이름을 입력하세요. >>>");
        myName = scanner.nextLine(); // 사실 이 nextLine();이 메서드 입니다. -> 메서드의 결과값을 myName이라는 변수에 저장했습니다.


        System.out.println("나이를 입력하세요. >>>");
        myAge = scanner.nextInt();
        System.out.println(introduce(myName, myAge)); // 그리고 그 myName / myAge 라는 결과값을 우리가 정의한 introduce() 메서드의 argument
    }


}
