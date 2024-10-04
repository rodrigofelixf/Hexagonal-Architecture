package br.com.rodrigofelix.hexagonal_arc.adapter.repository;

import br.com.rodrigofelix.hexagonal_arc.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
