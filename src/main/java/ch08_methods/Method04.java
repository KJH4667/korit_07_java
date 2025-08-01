package ch08_methods;

import java.util.Scanner;

public class Method04 {

    public static String getStar() {
        String result = "";

        Scanner scanner = new Scanner(System.in);
        int rowOfStars = 0;
        int option = 0;

        System.out.println("몇 줄 짜리 별을 생성할까요?");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽 정렬 증가하는 별");
        System.out.println("2. 오른쪽 정렬 증가하는 별");
        System.out.println("3. 왼쪽 정렬 감소하는 별");
        System.out.println("4. 오른쪽 정렬 감소하는 별");
        System.out.print("선택하세요 >>> ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                // 왼쪽 정렬 증가
                for (int i = 1; i <= rowOfStars; i++) {
                    result += "*".repeat(i) + "\n";
                }
                break;

            case 2:
                // 오른쪽 정렬 증가
                for (int i = 1; i <= rowOfStars; i++) {
                    result += " ".repeat(rowOfStars - i) + "*".repeat(i) + "\n";
                }
                break;

            case 3:
                // 왼쪽 정렬 감소
                for (int i = rowOfStars; i >= 1; i--) {
                    result += "*".repeat(i) + "\n";
                }
                break;

            case 4:
                // 오른쪽 정렬 감소
                for (int i = rowOfStars; i >= 1; i--) {
                    result += " ".repeat(rowOfStars - i) + "*".repeat(i) + "\n";
                }
                break;

            default:
                result = "잘못된 선택입니다.";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getStar());
    }
}



//String result = "";               //강사님 깃허브 파일 복사 붙혀넣기 한것
//Scanner scanner = new Scanner(System.in);
//int rows = 0;
//int option = 0;
//        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
//rows = scanner.nextInt();
//        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
//        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
//        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
//        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
//        System.out.print("선택하세요 >>> ");
//option = scanner.nextInt();
//
//        switch (option) {
//        case 1:
//        for (int i = 0 ; i < rows + 1 ; i++) {
//        for (int j = 0 ; j < i ; j++) {
//result += "*";
//        }
//result += "\n";
//        }
//        break;
//        case 2:
//        for ( int i = 0 ; i < rows ; i++) {
//        for( int j = 0 ; j < rows - (i + 1) ; j++ ) {
//result += "  ";
//        }
//        for ( int k = 0 ; k < i + 1 ; k++ ) {
//result += "✌️";
//        }
//result += "\n";
//        }
//        break;
//        case 3:
//        for ( int i = 0 ; i < rows ; i++ ) {
//        for ( int j = rows ; j > i ; j-- ) {
//result += "😎";
//        }
//result += "\n";
//        }
//        break;
//        case 4:
//        for ( int i = 0 ; i < rows ; i++ ) {
//        for ( int j = 0 ; j < i + 1 ; j++ ) {
//result += "  ";
//        }
//        for ( int k = rows ; k > i ; k-- ) {
//result += "🎈";
//        }
//result += "\n";
//        }
//        break;
//default:
//result = "해당 기능이 없습니다";
//        }
//        return result;
//    }
//
//public static void main(String[] args) {
//    System.out.println(getStar());
//}
//}

// Overloading 클래스 생성
