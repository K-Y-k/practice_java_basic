package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(1000);
        System.out.println("balance = " + account.getBalance()); // 데이터 필드를 직접 접근하지 않고 메서드를 통해서만 접근할 수 있다.
    }
}
