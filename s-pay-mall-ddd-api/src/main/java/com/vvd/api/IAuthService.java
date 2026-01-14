package com.vvd.api;

import com.vvd.api.response.Response;

/**
 * @author vvd
 * @description
 * @create 2026-01-14 21:43
 */
public interface IAuthService {

    Response<String> weixinQrCodeTicket();

    Response<String> checkLogin(String ticket);

}
