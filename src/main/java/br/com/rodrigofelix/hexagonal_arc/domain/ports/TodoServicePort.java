package br.com.rodrigofelix.hexagonal_arc.domain.ports;

import br.com.rodrigofelix.hexagonal_arc.domain.Todo;

import java.util.List;

public interface TodoServicePort {

    Todo saveTodo(Todo todo);

    List<Todo> findAll();
}
