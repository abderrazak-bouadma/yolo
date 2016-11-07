package com.unicorn;

import com.unicorn.domain.Todo;
import com.unicorn.domain.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    private final TodoRepository todoRepository;
	@Override
	public void run(String... args) throws Exception {
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
        todoRepository.save(Todo.builder().title("Spring Cloud Tutorial").data("Implement the spring cloud tutorial").time(LocalDateTime.now()).status(Todo.TodoStatus.OPEN).build());
	}
}
