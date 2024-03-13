package com.thinkitdevit.tinyconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TinyconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyconfigserverApplication.class, args);
	}

}
