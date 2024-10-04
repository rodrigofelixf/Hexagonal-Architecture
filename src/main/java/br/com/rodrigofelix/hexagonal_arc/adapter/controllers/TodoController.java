package br.com.rodrigofelix.hexagonal_arc.adapter.controllers;


import br.com.rodrigofelix.hexagonal_arc.domain.Todo;
import br.com.rodrigofelix.hexagonal_arc.domain.ports.TodoServicePort;
import br.com.rodrigofelix.hexagonal_arc.domain.services.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TodoController {

    private final TodoServicePort todoServicePort;


    public TodoController(TodoServicePort todoServicePort) {
        this.todoServicePort = todoServicePort;
    }


    @PostMapping
    public ResponseEntity<Todo> create(@RequestBody Todo todo) {
        return new  ResponseEntity<>(todoServicePort.saveTodo(todo),HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {
        return new ResponseEntity<>(todoServicePort.findAll(), HttpStatus.OK);
    }
}
