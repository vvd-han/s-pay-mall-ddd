package com.vvd.domain.auth.service;

import java.io.IOException;

/**
 * @author vvd
 * @description
 * @create 2026-01-14 16:52
 */
public interface ILoginService {

    String createQrCodeTicket() throws Exception;

    String checkLogin(String ticket);

    void saveLoginState(String ticket, String openid) throws IOException;

}

