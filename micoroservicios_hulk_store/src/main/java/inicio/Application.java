package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "com.tienda.controller", "com.tienda.dao", "com.tienda.service", "com.tienda.enums" })
@EntityScan(basePackages = { "com.tienda.model" })
@EnableJpaRepositories(basePackages = { "com.tienda.dao" })
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
