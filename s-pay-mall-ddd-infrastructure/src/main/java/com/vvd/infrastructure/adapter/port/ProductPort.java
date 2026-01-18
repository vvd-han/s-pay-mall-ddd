package com.vvd.infrastructure.adapter.port;

import com.vvd.domain.order.adapter.port.IProductPort;
import com.vvd.domain.order.model.entity.ProductEntity;
import com.vvd.infrastructure.gateway.ProductRPC;
import com.vvd.infrastructure.gateway.dto.ProductDTO;
import org.springframework.stereotype.Component;

/**
 * @author vvd
 * @description
 * @create 2026-01-15 17:35
 */
@Component
public class ProductPort implements IProductPort {

    private final ProductRPC productRPC;

    public ProductPort(ProductRPC productRPC) {
        this.productRPC = productRPC;
    }

    @Override
    public ProductEntity queryProductByProductId(String productId) {

        ProductDTO productDTO = productRPC.queryProductByProductId(productId);
        return ProductEntity.builder()
                .productId(productDTO.getProductId())
                .productName(productDTO.getProductName())
                .productDesc(productDTO.getProductDesc())
                .price(productDTO.getPrice())
                .build();
    }
}
