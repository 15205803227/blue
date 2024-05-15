package com.blue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.blue.*" //扫描框架starter:cn.com.datadriver.fund
		, "com.blue.*.**"
})
public class BaymaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaymaxApplication.class, args);
	}

}
