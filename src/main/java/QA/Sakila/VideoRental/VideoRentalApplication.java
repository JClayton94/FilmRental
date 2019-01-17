package QA.Sakila.VideoRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VideoRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoRentalApplication.class, args);
	}

}

