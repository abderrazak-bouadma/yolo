package com.unicorn.controller;

import com.unicorn.domain.Todo;
import com.unicorn.domain.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by abderrazakbouadma on 09/10/16.
 */
@RestController
@RequestMapping(value = "/todos", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TodoController {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll();
    }
}
