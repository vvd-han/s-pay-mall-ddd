package com.vvd.domain.order.adapter.repository;

import com.vvd.domain.order.model.aggregate.CreateOrderAggregate;
import com.vvd.domain.order.model.entity.OrderEntity;
import com.vvd.domain.order.model.entity.PayOrderEntity;
import com.vvd.domain.order.model.entity.ShopCartEntity;

/**
 * @author vvd
 * @description
 * @create 2026-01-15 16:54
 */
public interface IOrderRepository {
    void doSaveOrder(CreateOrderAggregate orderAggregate);

    OrderEntity queryUnPayOrder(ShopCartEntity shopCartEntity);

    void updateOrderPayInfo(PayOrderEntity payOrderEntity);
}