package com.example.todolistbackend.todo.controller;

import com.example.todolistbackend.todo.domain.dto.TodoListDto;
import com.example.todolistbackend.todo.service.TodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TodoListController {

    private final TodoListService todoListService;

    @PostMapping("/api/v1/todo-list")
    public ResponseEntity<TodoListDto> createTodoList(@RequestBody TodoListDto todoListDto) {
        return new ResponseEntity<>(todoListService.createTodoList(todoListDto), HttpStatus.CREATED);
    }

    @GetMapping("/api/v1/todo-list")
    public ResponseEntity<String> getTest() {
        return new ResponseEntity<>("TEST", HttpStatus.OK);
    }

}
