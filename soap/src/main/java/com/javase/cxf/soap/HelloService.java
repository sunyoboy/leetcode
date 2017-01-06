package com.javase.cxf.soap;

import javax.jws.WebService;

/**
 * Created by root on 11/26/16.
 */
@WebService
public interface HelloService {
    String say(String name);
}
