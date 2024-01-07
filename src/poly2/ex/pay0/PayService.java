package poly2.ex.pay0;

/**
 * 다형성을 활용하기 전 예시로
 * 결제 방식이 추가될 때마다 일일히 변경하는 부분이 많은 문제가 발생한다.
 */
public class PayService {
    public void preocessPay(String payOption, int amount) {
        boolean result;

        System.out.println("결제를 시작합니다: option=" + payOption + ", amount=" + amount);
        if (payOption.equals("kakao")){
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (payOption.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }


        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
