package org.prgrms.yas;

import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class YasApplication {
	
		@PostConstruct
		public void started() {
			TimeZone.setDefault(TimeZone.getTimeZone("KSA"));
		}
	
	public static void main(String[] args) {
		SpringApplication.run(
				YasApplication.class,
				args
		);
	}
}
