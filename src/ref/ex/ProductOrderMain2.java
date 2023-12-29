package ref.ex;

public class ProductOrderMain2 {
    // class1 패키지의 ex 패키지의 ProductOrderMain을 메서드를 활용하여 리팩토링
    
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        // 객체 생성 및 필드 정보 등록
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

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
