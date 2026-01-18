package com.vvd.api;

import com.vvd.api.dto.CreatePayRequestDTO;
import com.vvd.api.response.Response;

/**
 * @author vvd
 * @description
 * @create 2026-01-18 15:29
 */
public interface IPayService {

    Response<String> createPayOrder(CreatePayRequestDTO createPayRequestDTO);

}
