package fit.iuh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "fit.iuh")
public class SalesSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesSystemApplication.class, args);
	}

}
