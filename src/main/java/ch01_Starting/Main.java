package ch01_Starting;

/*
    주석(comment): 자바 프로그램의 겨우 폴더 및 파일의 전체 코드를 콤퍼알랑 하는데, 거기서 오류가 하나라도 발생하게 되면 전체프로그램이 실행이 안된다.
    하지만 주석 처리 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에 오류가 발생하지 않습니다.

    즉, 주석이란 컴퓨터가 알아서 처러하는 부분이 아니라 사람이 읽어서 정보를 얻을수 있는데에 의의가 있습니다.

    1) 한줄 주석: //
    2)다중 주석: / + shift + 8 + enter
    3)사후 주석: 주석을 처리할 부분의 코드 라인에 Ctrl + /(Mac: commend + /)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요. 학생입니다");
//        System.out.println("안녕하세요. 학생입니다");
        System.out.println("123");
        System.out.println(123);
        System.out.println('1');
        System.out.println('a');
/*
    이상과 같은 방식의 코드 대입을(매번 데이터를 직접 사용하는 방식)
    하드 코딩이라는 방식을 씁니다.
    하드코딩: 명령문에 데이터(변수에 대입되지 않은 데이터인데 이를 리터럴(Literal)를 바로 잡아넣는 것으로, '지압'되는 방식)

    그렇다면 권장되는 방식은? 데이터를'변수'에 대입하고, 변수를 통해서 명령을 내리는 방식

    변수(variable): 데이터를 담는 바구니 -> 이름을 달아줘야 함,
    변수 선언 방법: 자료명, 변수명 = 데이터 ;
 */
        int scoreEnglish = 100;        //변수 선언 및 초기화
        System.out.println(scoreEnglish); //sout -> 출력문
        int KoreanScore;        //변수 선언
        KoreanScore = 99;       //초기화

        String introduction = "안녕하세요";
        System.out.println(introduction + ",앞으로 잘 부탁드립니다");


        /*

       Java에서의 변수 명명 규칙 : 1. 카멜 표기법(camel) 사용. 첫 문자는 소문자로 시작/ 복수의 단어로 이러우졌을 경우
       두번째 단어의 첫번째 문자만 대문자
       ex) 한 단어 짜리: result
       ex) 복수 짜리: myTestResult
       2. 특수문자 지양
         */
//        System.out.println(scoreEnglish);
//        //변수 - 값이 바뀔수 있음
//        scoreEnglish = 90;      // 재 대입할때는 자료형 명사 x
//        System.out.println(scoreEnglish);


        //자료형 수업
        //1. 논리 자료형(boolean) 변수: 참 / 거짓 (ture /false)
        //자료형 변수명 = 데이터(값);         //변수의 선언 및 초기화
//        boolean checkFlag1 = false;
//        checkFlag1 = true;        //재대입

        //2.문자 자료형 변수 char
//        char name1 = '권';
//        char name2 = '장';
//        char name3 = '후';
//        System.out.println(name1 + name2 + name3); // 결과값
//        System.out.println('권'+'장'+'후');
//
//        System.out.println();

        /*
        이상의 코드에서 알 수 있는 점은 컴퓨터가 생각보다 멍청하다.
        개발자인 저희가 하나하나 지적을 해줘야 한다는 점입니다.
        '문자'와 '문자열'은 서로다른 개념인데, 문자(하나짜리)를 세번 더했을 경우에는 더이상의 문자가 아니라 문자열로 인식되기 때문에
        원하는 방식으로 출력되지 않습니다. 144어쩌고로 출력됬죠.

        그렇기 때문에 74 번 라인에서 sout()의 괄호 내부의() ""를 넣어주니깐 원하는 결과값을 얻을수 있었습니다.

        즉, 작은따옴표는 문자를 표시하기 위한 기호
        큰 따옴표는 문자열을 표시하기 위한 기호
        라고 알아두시면 되겠습니다(근데 python이랑 JavaScript 에서는 또 이런구분이 없습니다.)

        그리고 sout()dml ()내부에서 가장 먼저 나온 데이터의 자료형을 따라간다는 점도 확인할 수 있습니다.

        현재 개념: 허나짜리 문자가 여러개 모이면 문자열
        char : 문자
        String: 문자열
         */
//        char name = '김';
//        String name5 = "철수";
//
//        System.out.println(123+1);      //결과값: 124
//        System.out.println("123"+1);    //결과값: 1231
//        System.out.println(123+"1");    //결과값: 1231. 근데 얘기 예외적입니다.

//        3. 정수 자료형 변수 (int)
//        int width1 = 100;
//        int width2 = 200;
//        System.out.println(width1 + width2);
//        String width3 = "300";
//        String width4 = "400";
//        System.out.println(width3 + width4);    //300400
        //문자열은 연산이 아니라 "나열" 됩니다.

        //문자열은 '순서'가 중요합니다
//        Integer width5 = 500;
//        Integer width6 = 600;
//        System.out.println(width5 + width6); // 근데 대문자로 시작하는 Integer가 있긴 합니다.

        //4. 실수 자료형 변수 double
        double pi = 3.1415926;
        //int pi = 3.14;    // 오류발생
        //정수 / 실수 자료형은 수학 연산이 가능합니다.
        /*
        +: 더하기
        -:빼기
        *:곱하기
        /:나누기
        %:나머지
        */

        //문자열의 경우에는 + 연산만 가능합니다.
        String name = "안근수";
        String major = "영어교육과";
        String currentJob = "코리아";
        String previousJob = "IT국비 강사";

        //변수 선언
        String name10;
        String major10;
        String mbti10;
        int age10;


        /*
        제가 위에 선언한 변수들에 여러분들에게 적합한 데이터로 '초기화' 하여
        '저는 코리아 it 아카데미 7월 국비과정을 수료하고 있는 권장후 입니다. 28살 입니다.  -> 줄바꿈
        제 전공은 사회복지과 이며 mbti는 ISTP 입니다.  열심히 하겠습니다
        위 값이 출력될수 있도록 sout를 작성하시오.
         */
        name10 = "김 십";
        major10 = "공용학과";
        mbti10 = "ISTP";
        age10 = 30;

        System.out.println();

        //enter :
        // 역슬래시n:
        //


        //ch_03 opertator 패키지 생성 -> operator01 클래스를 생성 -> main도 적용





    }
}

