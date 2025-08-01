package ch07_loops;

/*
중첩 while문(Nested - while)
while(조건식1) {
반복실행문1-a
while(조건식2) {
반복실행문2
}
반복실행문 1-b
}
 */
public class Loop03 {
    public static void main(String[] args) {
//        int day = 1;
        //1일차 1교시 입니다. ~1일차 3교시 입니다
        //2일차 1교시 입니다. ...
        //5일 1교시입니다. ~5일차 3교시입니다.
//        while(day < 6) {
//            int lesson = 1;     //반복실행문 1-a에 해당합니다. 변수의 선언 및 초기화입니다.
//            while(lesson < 4) {
//                System.out.println(day + "일차" + lesson + "교시입니다."); //반복실행문
//                lesson++;
//            }
//            day++; //반복실행문 1-b에 해당하겠네요
//            System.out.println(lesson);
//    }
//        System.out.println(day); // 근데 day를 쓰니깐 된다;
//        System.out.println(lesson); //여기서 }밖에 쓰면 lesson이 안된다.
    //명확한 설명은 추후에 해드리겠습니다. 다만 지금 여기서 도입된 개념은 scope(범위)라는 것으로, 전역(전체영역) / 지역으로 나뉜다는 점이 중요합니다.

    // 이상의 코드를 활용하여
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 9 x 9 = 81을 출력하시오.

    int dan = 2;
    while(dan< 10)

    {
        int num = 1;
        while (num < 10) {
            System.out.println(dan + "X" + num + "=" + (dan * num));
            num++;
        }
        dan++;
    }
}
}

