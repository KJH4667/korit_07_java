package ch19_generic;

import javax.xml.crypto.Data;
import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();  // Java 내장 클래스로 객체 생성

        ResponseData<String> responseData1 = new ResponseData("날짜 저장 성공", now.toString());
        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData("나이저장 성공" , 38);



        ResponseData<Data> responseData3 = new ResponseData("날자 객체 저장 성공" , String.valueOf(now));
        System.out.println(responseData1);


    }

}
