package br.com.rodrigofelix.hexagonal_arc.adapter.repository;

import br.com.rodrigofelix.hexagonal_arc.adapter.entities.TodoEntity;
import br.com.rodrigofelix.hexagonal_arc.domain.Todo;
import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class TodoRepositoryAdapter implements TodoRepositoryPort {

    private final TodoRepository todoRepository;
    private final ModelMapper modelMapper;

    public TodoRepositoryAdapter(TodoRepository todoRepository, ModelMapper modelMapper) {
        this.todoRepository = todoRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public Todo save(Todo todo) {
        TodoEntity entityToSave = modelMapper.map(todo, TodoEntity.class);
        TodoEntity entitySaved = todoRepository.save(entityToSave);
        return modelMapper.map(entitySaved, Todo.class);
    }

    @Override
    public List<Todo> findAll() {
        var todoEntityList = todoRepository.findAll();
        return todoEntityList.stream()
                .map(todoEntity -> modelMapper.map(todoEntity, Todo.class))
                .toList();
    }
}
