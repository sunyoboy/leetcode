package com.javase.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

/**
 * Created by root on 11/27/16.
 */
public class DynamicClient {
    public static void main(String[] args) {
        DynamicClientFactory factory = DynamicClientFactory.newInstance();
        Client client = factory.createClient("http://localhost:8080/ws/soap/hello?wsdl");

        try {
            Object[] results = client.invoke("say", "world!");
            System.out.println(results[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
