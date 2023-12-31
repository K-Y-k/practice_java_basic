package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;  // 같은 클래스명이 있어 패키지명 조심해서 지정해야한다!

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
