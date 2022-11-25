package br.com.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.todolist.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
