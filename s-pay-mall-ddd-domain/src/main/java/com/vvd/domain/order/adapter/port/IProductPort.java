package com.vvd.domain.order.adapter.port;

import com.vvd.domain.order.model.entity.ProductEntity;

/**
 * @author vvd
 * @description
 * @create 2026-01-15 16:55
 */
public interface IProductPort {
    ProductEntity queryProductByProductId(String productId);

}