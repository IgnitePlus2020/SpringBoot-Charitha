package com.ignite.spring.EmployeeDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeDetailsApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(EmployeeDetailsApplication.class, args);
	}
}