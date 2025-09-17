package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ReportService;
import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		int i=10;
		int age=50;

		ConfigurableApplicationContext ctxt =
				SpringApplication.run(Application.class, args);

		UserService us = ctxt.getBean(UserService.class);
		us.saveUser();
		
		ReportService rs = ctxt.getBean(ReportService.class);
		rs.generateReport();
	}

}
