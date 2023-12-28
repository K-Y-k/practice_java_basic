package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        int totalPrice = 0;

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        productOrders[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        productOrders[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        productOrders[2] = product3;


        for (ProductOrder p : productOrders) {
            totalPrice += p.price * p.quantity;
            System.out.println("상품명: " + p.productName + " 가격: " + p.price + " 수량: " + p.quantity);
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}
