package com.tencent.warmli.servicecommons.api;

import org.springframework.stereotype.Component;

import javax.inject.Singleton;
import javax.ws.rs.Path;

/**
 * @author warmli
 */
public interface LoginApi {
    String login();
}
