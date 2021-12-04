package AntonioMartinez.DuenoServicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DuenoServicioApplication {

	public static void main(String[] args) {
	SpringApplication.run(DuenoServicioApplication.class, args);
	}

	@Bean
	public RestTemplate getrestemplate(){
		return new RestTemplate();
	}

}
