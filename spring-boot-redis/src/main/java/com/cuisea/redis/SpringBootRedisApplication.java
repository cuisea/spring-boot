package com.cuisea.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring boot redis +Thymeleaf 示例
 * http://www.ityouknow.com/springboot/2016/03/06/springboot(%E4%B8%89)-Spring-Boot%E4%B8%ADRedis%E7%9A%84%E4%BD%BF%E7%94%A8.html
 * 2017-11-21
 */
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.cuisea.redis.dao")
public class SpringBootRedisApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootRedisApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisApplication.class, args);
	}
}
