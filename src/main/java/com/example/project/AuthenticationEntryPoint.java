package com.example.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

//We can extend the BasicAuthenticationEntryPoint to intercept the error message before it is sent to the client.
//This way we can control what we sent as a response.

@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

        @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setHeader("WWW-Authenticate", "Basic realm=" + getRealmName());
        response.setContentType("application/json");

        PrintWriter writer = response.getWriter();
        writer.println("Custom HTTP Status 401 : " + authException.getMessage());

    }
	
	@Override
    public void afterPropertiesSet() throws Exception {
        setRealmName("ShrutiAPI");
        super.afterPropertiesSet();
    }

}
