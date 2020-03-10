package com.jiayaxing.autocofig.bean;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationEntryPoint  implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        String returnData = null;
        Throwable cause = e.getCause();
        if(cause instanceof InvalidTokenException) {
            returnData = "{\"msg\":\"无效的token\",\"code\":1}";
        }else{
            returnData = "{\"msg\":\"身份验证失败\",\"code\":1}";
        }
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("text/javascript;charset=utf-8");
        httpServletResponse.getWriter().print(returnData);
    }
}
