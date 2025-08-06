package ch12_arrays;

public class Array08 {
    //접근 지정자 / return 자료형 / 메서드명(매개변수) { 구현부가 어떤식으로 이루어질지 return }
    public int calcSum(int[] intArray) {
        int sum = 0;
        for ( int i = 0 ; i < intArray.length; i++ ) {
            sum += intArray[i];
    }
    return sum;
}

//평균을 구하는 메서드를 정의

    public double calcAvg(int[] intArray) {
        double avg = 0;
        int sum = calcSum(intArray);
        avg = (double)sum/ intArray.length;
        return avg;
    }

    public static void main(String[] args) {
        //위에 정의한 method 호출하기 위해 객체 생성했습니다.
        Array08 array08 = new Array08(); // 클래스는 "설계도", 객체는 "설계도로 만든 물건"이라고 비유할 수 있어요.
        // 왜 이렇게 써야 할까?
        //Java에서 클래스 내부의 인스턴스 메서드를 호출하려면, 그 메서드를 포함한 객체를 먼저 생성해야 해요.
        //즉, calcSum()과 calcAvg()는 static이 아닌 인스턴스 메서드이기 때문에, 객체가 있어야 호출할 수 있는 거예요.
        int [] scores = { 100, 97, 55, 24, 49, 60, 20, 77, 89 };

        //이상의 예시 배열을 argument로 하는 총합ㅇ를 구하는 method calcSum,
        //평균을 구하는 calcAvg method를 정의하는데, call4() 유형으로 만드시오.
        int sum = array08.calcSum(scores);
        double avg = array08.calcAvg(scores);

        System.out.println("총합 : " + array08.calcSum(scores) + "점");
        System.out.println("평균 : " + array08.calcSum(scores) + "점");
    }
}
