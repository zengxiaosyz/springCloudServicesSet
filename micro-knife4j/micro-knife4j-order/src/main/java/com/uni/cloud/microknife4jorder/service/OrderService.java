package com.uni.cloud.microknife4jorder.service;

import com.uni.cloud.microknife4jorder.domain.Order;

public interface OrderService {
    void create(Order order);

    Order getOrder(Long id);

    void update(Order order);

    void delete(Long id);
}
