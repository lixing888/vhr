package org.sang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author lixing
 * http://localhost:8082/index.html
 * 微人事是一个前后端分离的人力资源管理系统，项目采用SpringBoot+Vue开发。
 */
@SpringBootApplication
@MapperScan("org.sang.mapper")
@EnableCaching
public class HrserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrserverApplication.class, args);
	}
}
