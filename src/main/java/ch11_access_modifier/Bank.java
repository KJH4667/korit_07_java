package ch11_access_modifier;
/*
    과제 가이드 라인
    1. 필드
    accountNum(계좌번호, 정수)
    accountHolder(예금주이름, 문자열)
    balance(잔액, 정수)
    pinNumber(비밀번호, 4자리 정수 0~9999)



  2. 생성자
  기본생성자
  1)계좌번호만 있는 생성자
  2)계좌번호, 예금주를 받는 생성자
  3)계좌번호, 예금주, 초기 잔액을 받는 생성자
  4)계좌번호, 예금주, 초기잔액, 비밀번호를 받는 생성자

  3. 메서드
  1) Setter / Getter
  특히 Setter의 경우에는 유효성 검증 로직을 삽입해야함.
  -> 잔액은 음수일 수 없음
  -> 비밀번호는 0 이상 9999이하까지만 가능 -> 실패하면 "불가능한 비밀번호 입니다."

  2) deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2() 유형으로 작성
  -올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다." 하고 메서드 종료
  -유효한 금액인지 검증(amount가 0 초과인지) -> 실패하면 "불가능한 입력 금액입니다."
  -콘솔창에 0000이 입금되었씁니다. 현재 잔액 : 0000원


  withdraw(int amount, int inputPin) -> 출금 관련 메서드 / call2() 유형으로 작성
  -올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다" 하고 메서드 종료
  -유효한 금액인지

  3)showAccountInfo() / call2()
  -콘솔창에
  계좌번호 : 123456
  계좌 소유자: 홍길동
  현재 잔액: 100000원
  라고 출력될 수 있도록 작성할 것.

  전체 실행 예

  계좌번호 : 123456
  계좌 소유자: 홍길동
  현재 잔액: 100000


  50000원이 입금되었씁니다. 현재 잔액 : 150000원          *account1에 대한 입금(오만원)
  잔액이 부족하여 출금할 수 없습니다.         *account1에서 200000원 출금 시도 실패 사례(이십만원)
  100000원이 입금되었씁니다. 현재 잔액 : 50000원          *account1에서 200000원 출금 (십만원 출금 성공)

  100000원이 출금되었습니다. 현재잔액 400000원        /* account2에 대한 출금(십만원)
  200000원이 출금되었습니다. 현재잔액 600000원        /*account2에 대한 입금(이십만원 입금)

  최종계좌 정보
  계좌번호: 123456
  현재 잔액: 50000원     (오만원)

  계좌 번호: 987654
  현재 잔액: 600000원    (육십만원)


 */

public class Bank {
    private int accountNum; // 계좌번호
    private String accountHolder; // 예금주
    private int pinNumber; // 비밀번호
    private int balance; // 초기잔액


    public Bank(int accountNum) { // 1)계좌번호만 있는 생성자
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) { // 2)계좌번호, 예금주를 받는 생성자
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) { // 3)계좌번호, 예금주, 초기 잔액을 받는 생성자
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int pinNumber, int balance) { // 4)계좌번호, 예금주, 초기잔액, 비밀번호를 받는 생성자
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.pinNumber = pinNumber;
        this.balance = balance;
    }
    // ↑ 여기까지 4개 생성자



    // 매서드 생성 Setter / Getter 차이점
    // Setter을 생성하게 되면 this.accountNum = accountNum; 이런식으로 작성하게 된다. this가 붙는다
    // Getter은 return이 들어가게 되며, return accountNum; 이런식으로 작성한다


    //아래에는 Getter를 먼저 적고, Setter를 적은듯 하다. 하나씩 따로
    // Getter 작성을 자세히 보면 ()안에 아무것도 안적음. 또한 public 이후 int 나 String이 들어간다.
    // Setter 또한 public 이후 void가 들어가고, ()안에 뭔가 변수를 선언했기 때문에 작성법이 달라진다.



    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    } // -> 1)계좌번호 Setter 먼저 작성후 Getter 작성함

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    } // // -> 2)예금주 Setter 먼저 작성후 Getter 작성함

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        // 수정 로직이 필요하겠네요.
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    } // -> 3)비밀번호 Setter 먼저 작성후 Getter 작성함

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance <= 0) {
            System.out.println("불가능한 잔액입니다.");
            return; // method 종료 단어이다. 만약에 if(balance <= 1 or 2) 0이 아닌 숫자가 들어간다면 return을 적을수가 없다.
        }
        this.balance = balance; // 이거 초기 잔액 세팅이기 때문에 입금은 얘로 이루어질수 없습니다.
    }

//    public void setBalance(int balance) {
//        this.balance = balance;
//    } 일단 여기 적어놓는다. 까먹을까봐 미리 메모
//

    //자동완성 이외의 매서드들
    public void deposit(int amount, int inputPin) {
        //1. 비밀번호가 맞는지 체크
        if(inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        //2. 입금 금액이 0원이 초과인지 체크
        if(amount <= 0) {
            System.out.println("불가능한 입금 금액입니다");
            return;
        }
        // 이상의 두 개의 조건문을 다 통과했다면(즉, inputPin == pinNumber && amount > 0)
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + balance);



        //3. 출금후 잔액이 0원 이상인지 체크
        if(balance - amount>= 0) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " +balance);
        } else {
            System.out.println("잔액이 부족하면 출금할 수 없습니다.");
        }


        //이상의 두 개의 조건문을 다 통과했다면(즉, inputPin == pinNumber && amount > 0)
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + balance);
    }

    public void withdraw(int amount, int inputPin) {
        //1. 비밀번호가 맞는지 체크
        if(inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        //2. 출금 금액이 0원 초과인지 체크
        if(amount <= 0) {
            System.out.println("불가능한 출금 금액입니다.");
            return;
        }
        //3. 출금 후 잔액이 0원 이상인지 체크
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + balance);
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
        }
    }

    public void showAccountInfo() {
        System.out.println("\n계좌번호 : " +accountNum);
        System.out.println("계좌소유자 : " +accountHolder);
        System.out.println("현재잔액 : " +balance+ "원");

    }



}

