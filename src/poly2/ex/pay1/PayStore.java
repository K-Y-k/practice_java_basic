package poly2.ex.pay1;

/**
 * 결제 수단이 변경되면 적용할 곳을 따로 분리하여
 * 결제 서비스 클래스에 변경이 일어나지 않게 만듬
 *
 * 즉, 변하는 부분과 변하지 않는 부분을 분리했다!
 */
public abstract class PayStore {
    public static Pay findPay(String payOption) {
        if (payOption.equals("kakao")) {
            return new KakaoPay();
        } else if (payOption.equals("naver")) {
            return new NaverPay();
        } else if (payOption.equals("new")){
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
