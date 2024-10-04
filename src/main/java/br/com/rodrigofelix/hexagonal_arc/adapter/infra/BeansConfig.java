package br.com.rodrigofelix.hexagonal_arc.adapter.infra;


import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoRepositoryPort;
import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoServicePort;
import br.com.rodrigofelix.hexagonal_arc.domain.services.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public TodoServicePort todoServicePort(TodoRepositoryPort todoRepositoryPort) {
        return new TodoService(todoRepositoryPort);
    }
}
