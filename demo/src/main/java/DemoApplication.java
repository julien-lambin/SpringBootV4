import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.io.IOException;

@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableJpaRepositories("com.kf.demo")
@EntityScan(value = "com.kf.demo.model")

public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);

/*		String url = "http://www.google.com";

		Document doc = Jsoup.connect(url).get();
		String title = doc.title();
		System.out.println(title);*/
	}

}
	//https://rpouiller.developpez.com/tutoriels/spring/application-web-spring-hibernate/
	//https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-thymeleaf/
	//https://o7planning.org/fr/11681/tutoriel-spring-boot-et-jsp
	//thymeleaf
	//jsp
	//https://stackoverflow.com/questions/41521302/spring-boot-bean-null-exception
	//http://zetcode.com/articles/springbootthymeleaf/
	//https://www.dev2qa.com/spring-boot-web-mvc-using-embedded-h2-database-example/
	//https://dashboard.heroku.com/apps/spring-boot-lambind60cb0a64cb046a14592b43d9385ad4a
	//IGDB API KEY: d60cb0a64cb046a14592b43d9385ad4a


