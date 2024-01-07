package poly2.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.preocessPay(payOption1, amount1);


        // naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.preocessPay(payOption2, amount2);


        // bad 결제
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.preocessPay(payOption3, amount3);
    }
}
