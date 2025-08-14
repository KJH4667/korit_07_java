package ch20_collections.practice;

import java.util.*;

public class FieldTrip {
    public static <set> void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        /*
            1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 들일것.
            2. 1번~5번 학새의 응답을 fieldTrips List에 지정할것
            3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
            4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalFieldTrips List에서 element들을 추출하여 작성할 것.
            실행 예
            몇명의 학생이 수학 여행지를 입력하시겠습니까? 5명
            1번 학생의 수학 여행지를 입력하세요 >>> 제주
            2번 학생의 수학 여행지를 입력하세요 >>> 제주
            3번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            4번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            5번 학생의 수학 여행지를 입력하세요 >>> 제주


            1번 학생의 후보자 : 제주
            2번 학생의 후보자 : 제주
            3번 학생의 후보자 : 민속촌
            4번 학생의 후보자 : 민속촌
            5번 학생의 후보자 : 제주


            수학 여행 후보자는
            제주
            민속촌
            입니다.
         */
        // 사용할 클래스 선언
        Scanner scanner = new Scanner(System.in);
        //사용할 변수 선언
        List<String> fieldTrips = new ArrayList<>();
        List<String> finalfieldTrips = new ArrayList<>();
        Set<String> fieldsTripsSet = new HashSet<>();
        int student = 0;
        System.out.print("몇명의 학생이 수학 여행지를 입력하시겠습니까?>>>>");
        student = scanner.nextInt();
        scanner.nextLine();
        for( int i = 0 ; i < student ; i++ ) {
            System.out.print((i+1) + "번 학생의 수학 여행지를 입력하세요. >>>");
            //list에서 element를 추가하는 메서드
            String fieldTrip = scanner.nextLine();
            fieldTrips.add(fieldTrip);
        }
//        System.out.println(fieldTrip);
    }


}
