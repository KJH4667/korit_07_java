package ch07_loops;
/*
 *
 **
 ***
 ****
 *****
 */

public class Loop08 {
    public static void main(String[] args) {
        //개행을 책임지는 for문

//<이것은 챗gpt의 도움을 받은 방식>
        for (int i = 0; i < 6; i++) {
            // 공백을 책임지는 for문 -> 공백은 늘어나야함
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" "); // ""안에 스페이스바를 눌러서 " "를 해줘야 안에 공백이 생겨서 별이 역방향으로 뜬다. 디테일 주의;
            }

            //별을 책임지는 for문 -> 별은 줄어들어야 함.
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }  // 여기 부분은 별이 오른쪽 순서대로 나온다. 하지만 밑에 챗gpt로는 역방향으로 나온다.
}

//        for (int i = 0; i < 6; i++) {
//            // 공백 출력: 줄마다 (5 - i)개
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print(" ");
//            }
//            // 별 출력: 줄마다 (i + 1)개
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print("*");
//            }
//            // 줄바꿈
//            System.out.println();
//        }
//    }
//}

//<강사님 풀이 방식>
//for (int i = 0; i < 6; i++) {
//        // 공백을 책임지는 for문.    이것은 별이 역방향 순서대로 만들어짐
//        for (int j = 5; j > i; j--) {
//        System.out.print(" "); // ""안에 스페이스바를 눌러서 " "를 해줘야 안에 공백이 생겨서 별이 역방향으로 뜬다. 디테일 주의;
//            }
//
//                    //별을 책임지는 for문 -> 별은 늘어나야 함.
//                    for (int k = 0; k < i + 1; k++) {
//        System.out.print("*");
//            }
//                    System.out.println();
//        } // 공백은 늘어나야함
//
//                }
//                }


