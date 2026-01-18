package com.vvd.infrastructure.dao;

import com.vvd.infrastructure.dao.po.PayOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author vvd
 * @description
 * @create 2026-01-15 16:59
 */
@Mapper
public interface IOrderDao {

    void insert(PayOrder payOrder);

    PayOrder queryUnPayOrder(PayOrder payOrder);

    void updateOrderPayInfo(PayOrder payOrder);

}