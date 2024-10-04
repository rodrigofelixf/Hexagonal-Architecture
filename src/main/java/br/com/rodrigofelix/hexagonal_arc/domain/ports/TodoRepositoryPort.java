package br.com.rodrigofelix.hexagonal_arc.domain.ports;

import br.com.rodrigofelix.hexagonal_arc.domain.Todo;

import java.util.List;

public interface TodoRepositoryPort {

    Todo save(Todo todo);

    List<Todo> findAll();
}
