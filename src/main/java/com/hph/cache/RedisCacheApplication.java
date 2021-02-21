package com.hph.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class RedisCacheApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(RedisCacheApplication.class, args);
	}

}
