package coms.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfullServiceWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullServiceWithJpaApplication.class, args);
		System.out.println("Server Started....... ");
	}

}
