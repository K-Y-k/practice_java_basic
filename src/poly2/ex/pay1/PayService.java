package poly2.ex.pay1;

/**
 * 변하지 않는 부분
 */
public class PayService {
    public void preocessPay(String payOption, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + payOption + ", amount=" + amount);

        // 결제 수단 찾기
        Pay pay = PayStore.findPay(payOption);

        // 결제 로직
        // DefaultPay 클래스를 따로 만든 덕분에 null을 체크해야 하는 조건문이 필요 없어져
        // 코드를 간결하게 만들 수 있다.
        result = pay.pay(amount);

        // 결제 결과 출력
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else  {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
