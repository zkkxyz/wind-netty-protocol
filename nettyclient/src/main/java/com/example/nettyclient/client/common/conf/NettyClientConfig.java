package com.example.nettyclient.client.common.conf;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.nettyclient.client.common")
@PropertySource(value={"classpath:application.properties"},ignoreResourceNotFound =true)
public  class NettyClientConfig {

    @Value("${netty.url}")
    private String localHostaddress;

    @Value("${netty.port}")
    private Integer localHostport;

    @Value("${netty.remote.url}")
    private String remoteHostAddress;

    @Value("${netty.remote.port}")
    private Integer remoteHostPort;


    public String getLocalHostaddress() {
        return localHostaddress;
    }

    public Integer getLocalHostport() {
        return localHostport;
    }

    public String getRemoteHostAddress() {
        return remoteHostAddress;
    }

    public Integer getRemoteHostPort() {
        return remoteHostPort;
    }


}
