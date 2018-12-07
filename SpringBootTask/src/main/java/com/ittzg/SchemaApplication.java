package com.ittzg;

import com.ittzg.task.TimedTaskDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //启动类一定不要忘记加这个注解，否则定时任务不会触发
public class SchemaApplication {

	/*@Bean
	public TimedTaskDemo getBean(){
		return new TimedTaskDemo();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SchemaApplication.class, args);
	}
}
