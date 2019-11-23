package com.tencent.warmli.servicecommons.api.impl;

import com.tencent.warmli.servicecommons.api.LoginApi;
import org.springframework.stereotype.Component;


import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author warmli
 */
@Component
@Singleton
@Path("/user/login")
public class LoginApiImpl implements LoginApi {

    @Override
    @GET
    public String login() {
        return "login";
    }
}
