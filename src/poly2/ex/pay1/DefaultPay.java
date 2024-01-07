package poly2.ex.pay1;

/**
 * null인 경우의 결제 방식을 Default 클래스로 따로 만든다!
 *
 * 이 클래스 덕분에 null을 체크해야 하는 조건문이 필요 없어져
 * 코드를 간결하게 만들 수 있다.
 */
public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
