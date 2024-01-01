package access;

/**
 * 캡슐화
 * - 데이터와 해당 데이터를 처리하는 메서드를 하나의 클래스 안에 묶고
 *   추가로 접근 제어자를 활용하여 외부에서의 접근을 제한하는 것을 말한다.
 *
 * - 즉, 외부에 꼭 필요한 기능만 노출하고
 *    나머지(데이터, 외부에 사용하지 않는 기능들)는 접근 제어자로 모두 내부로 숨기는 것이다.
 */

// 캡슐화로 잘 설계된 예시
public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 : 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : 금액 반환
    public int getBalance() {  // 멤버 변수 데이터 직접 접근을 private로 막았기에 메서드로 접근하여 값 반환한 것이다.
        return balance;
    }

    
    // private 메서드 : 금액양 확인
    // 이 메서드는 외부에서의 호출이 필요없는 기능이라서 prviate로 내부에서만 사용하도록 막음
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야한다.
        return amount > 0;
    }
}
