package com.example.rentcloudconfiggithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RentCloudConfigGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentCloudConfigGithubApplication.class, args);
    }

}
