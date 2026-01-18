package com.vvd.domain.order.service;

import com.vvd.domain.order.model.entity.PayOrderEntity;
import com.vvd.domain.order.model.entity.ShopCartEntity;

import java.util.List;

/**
 * @author vvd
 * @description
 * @create 2026-01-15 16:46
 */
public interface IOrderService {

    PayOrderEntity createOrder(ShopCartEntity shopCartEntity) throws Exception;

    void changeOrderPaySuccess(String orderId);

    List<String> queryNoPayNotifyOrder();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);

}
