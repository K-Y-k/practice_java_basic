package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {
    public void order() { // 주문 기능
        User user = new User();                  // 회원 생성
        Product product = new Product();         // 상품 생성
        Order order = new Order(user, product);  // 주문 생성
    }
}
