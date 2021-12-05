package MauricioDominguez.MedicamentoServicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MedicamentoServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicamentoServicioApplication.class, args);
	}
	@Bean
	public RestTemplate getrestemplate(){
		return new RestTemplate();
	}
}
