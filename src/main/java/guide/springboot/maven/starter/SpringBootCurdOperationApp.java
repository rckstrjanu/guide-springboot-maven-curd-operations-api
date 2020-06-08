package guide.springboot.maven.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "guide.springboot.maven", "starter", "model", "controller" })
public class SpringBootCurdOperationApp {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootCurdOperationApp.class, args);

	}

}
