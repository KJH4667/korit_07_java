package ch20_collections;
/*
    List는 순서가 있고 중복을 허용하는 방면, Set의 경우 순서는 없고 중복은 허용하지 않기 때문에 List -> Set / 혹은 Set -> List로의 형변환이 중요합니다.
    예를들어 List로 전체 설문을 받고, Set을 통해 중복을 제거하여 후보군만 남기는 등의 형태로 많이 사용됩니다. 또한 Set으로 중복을 제거한 후에 다시 List로 돌려서 .get(인덱스넘버)
    로 조회도 할수 있습니다. Set은 순서가  없어서...

    그래서 Set은 우리가 중1 때 배우는 집합 개념과 유사합니다. 다만 집합은 숫자로만 이루어졌던 반면에 Set은 다양한 자료형을 기준으로 만들어질 수 있다는 차이가 있습니다.
 */

import java.util.*;

public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>(); // 뻘건거 떴을때 alt + enter
        // List 객체도 생성
        List<String> strList = new ArrayList<>();

        //List / Set에 element 추가하는 방법은 동일합니다. 리스트 or 셋명.add(element);
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("java");
        System.out.println(strList);

        // Set에 추가 하나만 예시
        strSet.add("Typescript");
        // Set 출력       - toString() 작용
        System.out.println(strSet);

        //List의 element들을 전부 Set에 대입 -> 리스트명.addAll(세트명);
        strList.addAll(strSet);     // SVO로 하시기 바랍니다.
        System.out.println(strList);    // 원래 List는 그대로 유지
        System.out.println(strSet); // Set에 element들이 더해지긴 했는데,
        // 중복이 제거되어있습니다. 결과값 : [TypeScript, python, java, React]
//        for ( int i = 0 ; i < strSet.size(); i++ ) {
            //현재 상황에서 예를 들어 set 내부에 있는 각 element들을 추출하여 뒤에 "언어"라고 붙여서 java언어, 와 같이 데이터를 조작하는 것이 이상의 문제 등을 이유로
            // set -> list로의 변환 역시 자주 쓰입니다.
            List<String> modifieldStrList = new ArrayList <> ();
            //새로운 List에 대입하는 과정입니다.
            System.out.println(modifieldStrList);
            // set의 순서와 동일하게 들어갔기 때문에 마찬가지로 순서가 보장되지 않습니다.
            Collections.sort(modifieldStrList);
            System.out.println(modifieldStrList);

            // 그럼 이제는 list니까 요소를 추출해서 뒤에 "언어" 라고 붙일 수 있겠네요.
            /*
                실행 예
                React 언어
                TypeScript 언어
                Java 언어
                python 언어

                일반 for 문으로 / 향상된 for 문으로 작성하시오.
             */
            for ( int i = 0 ; i <modifieldStrList.size(); i++ ) {
                System.out.println(modifieldStrList.get(i) + "언어");
            }
            for ( String elem : modifieldStrList ) {
                System.out.println(elem + "언어 향상된 for문");
            }
        }
    }
// 5명의 학생이 있다고 가정하고 5명에게서 "제주" , "제주" , "민속촌", "민속촌", "제주" 라는 결과값을 입력받았을때
/*
제주
제주
민속촌
민속촌
제주

로 출력한번

제주
민속촌

출력 한번 할수 있도록 코드를 작성하시오.
 */
