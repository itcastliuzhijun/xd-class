package net.xdclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 旭瑶&小滴课堂 xdclass.net
 * @Author 二当家小D  代码、笔记和技术指导联系我即可
 * @Version 1.0
 **/

@SpringBootApplication
// 开启nacos
@EnableDiscoveryClient
// 开启feign
@EnableFeignClients
public class OrderApplication {

    public static void main(String [] args){

        SpringApplication.run(OrderApplication.class,args);
    }



    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
