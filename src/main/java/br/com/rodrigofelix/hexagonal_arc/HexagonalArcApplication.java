package br.com.rodrigofelix.hexagonal_arc;

import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoRepositoryPort;
import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoServicePort;
import br.com.rodrigofelix.hexagonal_arc.domain.services.TodoService;
import ch.qos.logback.core.model.Model;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HexagonalArcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalArcApplication.class, args);
	}



}
