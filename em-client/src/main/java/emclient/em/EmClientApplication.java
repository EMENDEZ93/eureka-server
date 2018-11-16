package emclient.em;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmClientApplication.class, args);
	}
}
