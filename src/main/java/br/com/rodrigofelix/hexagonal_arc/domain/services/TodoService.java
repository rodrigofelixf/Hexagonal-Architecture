package br.com.rodrigofelix.hexagonal_arc.domain.services;

import br.com.rodrigofelix.hexagonal_arc.domain.Todo;
import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoRepositoryPort;
import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoServicePort;

import java.util.List;

public class TodoService implements TodoServicePort {

    private final TodoRepositoryPort todoRepositoryPort;

    public TodoService(TodoRepositoryPort todoRepositoryPort) {
        this.todoRepositoryPort = todoRepositoryPort;
    }

    @Override
    public Todo saveTodo(Todo todo) {
        return this.todoRepositoryPort.save(todo);
    }

    @Override
    public List<Todo> findAll() {
        return this.todoRepositoryPort.findAll();
    }
}
