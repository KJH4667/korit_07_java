package ch03_opertator;

/*
Camel case -> Java 상에서의 변수 표기법(JS에서도 씁니다.)
Camel case -> 얘는 뭐 Java에서 쓸일이 없습니다. 근데 전체 상수 사용시에 비슷한 표기법이 적용됩니다.
Pasacal case -> 첫번째 문자가 대문자고 나머지 문자는 소문자로 가다가 두번째 단어는 또 대문자
한 단어 짜리: Operator01
복수 단어 짜리: OperatorTestResult        -> Pascal Case는 클래스 명명 규칙에 해당합니다.
 */

public class operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        //이전 단계에서 자료형, 변수명, 데이터에 대해서 학습했습니다
        //이번에는 "="를 배울겁니다.
        i = i+1;
        /*
        대입 연삽자 = 왼쪽과 오른쪽이 같다는 의미가 아니라
        = 오른쪽에 있느 데이터를 = 왼쪽에 있는 변수에 '대입'한다는 의미입니다.

        그렇다면 왼쪽과 오른쪽이 같은값이다. 라고 표시할때는 어떻게 할까요?

        ==
        ===
         */

        //일반 연산자
        /*
        +: 더하기
        -:빼기
        *:곱하기
        /:나누기
        %:나머지
         */
        int a = 5;          //int 는 정수였죠
        int b = 2;          // 변수 선언 및 초기화
        double result = (double) a / b; // (double)은 강제 형변환 입니다
        System.out.println(a/b);        //근데 2개가 나오죠
        System.out.println(result);     //얘는 2.5가 나오죠
        //그래서 생각보다 코딩할때도 얘네가 멍청해서 하나하나 잘 지정해야 합니다.
        //그래서 개발자는 뭐다?
        //컴퓨터가 잘 작동할수 있도록 잘 명령을 내리는 사람이다. 라고 생각해주시고
        //좀 이르고 달래고 해야합니다.


        /*
         복합 대입 연산자
         1)+=
         2)-=
         3)*=
         4)/=
         */
        int num1 = 1;
        System.out.println(num1); // num1
        num1 += 2;
        System.out.println(num1); // num1 = num1 +2
        num1 -= 1;
        System.out.println(num1); // num1 = num1 - 1
        num1 *= 10;
        System.out.println(num1); // num1 = num1 * 10
        num1 /= 5;
        System.out.println(num1); // num1 = num1 / 5

        int j = 10;
        System.out.println(j);
        System.out.println(j++); // 변수명 ++: 코드를 실행시킨후 변수명 j에 1를 더함
        System.out.println(j); // 위에 코드가 실행되고 +1 됐기 때문에 11출력
        System.out.println(++j); // ++변수명: 코드를 실행시키기전에 변수명 j에 1를 더함. 그래서 12출력
        System.out.println(j); //위에 더한 상태로 출력된거라 위와 동일하게 12 출력됨
        System.out.println(j--); // 그럼 예의 출력값은 뭔가요? -12
        System.out.println(j); // 11
        System.out.println(--j); //10
        System.out.println(j); // 10

    }
}
