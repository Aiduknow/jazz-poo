package MavenTP3.jas_poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.ensim.info.tp3aymaneouhadi.model.Address;
import fr.ensim.info.tp3aymaneouhadi.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
public class JasPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasPooApplication.class, args);
	}

}
