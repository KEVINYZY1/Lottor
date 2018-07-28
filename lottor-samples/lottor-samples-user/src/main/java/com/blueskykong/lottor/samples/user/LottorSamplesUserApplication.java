package com.blueskykong.lottor.samples.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LottorSamplesUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LottorSamplesUserApplication.class, args);
    }
}
