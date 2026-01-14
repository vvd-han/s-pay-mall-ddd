package com.vvd.domain.auth.adapter.port;

import java.io.IOException;

/**
 * @author vvd
 * @description
 * @create 2026-01-14 21:17
 */
public interface ILoginPort {

    String createQrCodeTicket() throws IOException;

    void sendLoginTemplate(String openid) throws IOException;

}
