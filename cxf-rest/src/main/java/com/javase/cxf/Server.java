package com.javase.cxf;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.javase.cxf.rest.impl.ProductServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.ResourceProvider;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 11/27/16.
 */
public class Server {
    public static void main(String[] args) {
        // add ResourceClass
        List<Class<?>> resourceClassList = new ArrayList<Class<?>>();
        resourceClassList.add(ProductServiceImpl.class);

        // add RescourceProvider
        List<ResourceProvider> resourceProviderList = new ArrayList<ResourceProvider>();
        resourceProviderList.add(new SingletonResourceProvider(new ProductServiceImpl()));

        // add Provider
        List<Object> providerList = new ArrayList<Object>();
        providerList.add(new JacksonJsonProvider());

        // publish REST 服务
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/rest");
        factoryBean.setResourceClasses(resourceClassList);
        factoryBean.setResourceProviders(resourceProviderList);
        factoryBean.setProviders(providerList);
        factoryBean.create();
        System.out.println("rest ws is published");
    }
}
