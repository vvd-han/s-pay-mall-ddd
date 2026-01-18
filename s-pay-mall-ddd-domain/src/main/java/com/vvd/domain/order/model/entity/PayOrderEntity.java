package com.vvd.domain.order.model.entity;

import com.vvd.domain.order.model.valobj.OrderStatusVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vvd
 * @description
 * @create 2026-01-15 16:40
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayOrderEntity {

    private String userId;
    private String orderId;
    private String payUrl;
    private OrderStatusVO orderStatus;

}

