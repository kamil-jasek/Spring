package com.clockworkjava.kursspring;

import com.clockworkjava.kursspring.domain.Castle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
/*@ComponentScan({"com.clockworkjava.kursspring.domain","com.clockworkjava.kursspring.component" } )*/
@PropertySource("classpath:castle.properties")
public class KursspringApplication {

	public static void main(String[] args)


	{
		SpringApplication.run(KursspringApplication.class, args);


	}

}
