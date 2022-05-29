package curation.sharinggiving;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SharingGivingApplication {

	public static final String APPLICATION_LOCATIONS = "spring.config.location=" + "classpath:application.properties," + "classpath:aws.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(SharingGivingApplication.class)
				.properties(APPLICATION_LOCATIONS)
				.run(args);
//		SpringApplication.run(SharingGivingApplication.class, args);
	}
}
