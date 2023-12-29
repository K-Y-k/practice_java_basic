package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    // ProductOrderMain2를 사용자가 직접 입력 방식으로 변경
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = input.nextInt();

        ProductOrder[] productOrders = new ProductOrder[count];
        for (int i = 0; i < productOrders.length; i++) {
            input.nextLine();
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = input.nextLine();

            System.out.print("가격: ");
            int price = input.nextInt();

            System.out.print("수량: ");
            int quantity = input.nextInt();

            // 객체 생성 및 필드 정보 등록
            productOrders[i] = createOrder(productName, price, quantity);
        }

        // 전체 상품 정보 출력
        printOrders(productOrders);

        // 총금액 계산 및 출력
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }


    // 객체 생성 및 필드 정보 등록 메서드
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    // 전체 상품 정보 출력 메서드
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder p : orders) {
            System.out.println("상품명: " + p.productName + " 가격: " + p.price + " 수량: " + p.quantity);
        }
    }

    // 총금액 계산 및 출력 메서드
    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;

        for (ProductOrder p : orders) {
            totalPrice += p.price * p.quantity;
        }

        return totalPrice;
    }
}
