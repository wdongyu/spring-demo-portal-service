package org.springframework.samples.demo.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wdongyu
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PortalServiceApplication {

    //@LoadBalanced
    @Bean
    RestTemplate restTemplate() {
	return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(PortalServiceApplication.class, args);
    }
}
