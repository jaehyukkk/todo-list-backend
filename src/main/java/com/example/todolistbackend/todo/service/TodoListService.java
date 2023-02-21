package com.example.todolistbackend.todo.service;

import com.example.todolistbackend.todo.domain.dto.TodoListDto;
import com.example.todolistbackend.todo.repository.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TodoListService {

    private final TodoListRepository todoListRepository;

    public TodoListDto createTodoList(TodoListDto todoListDto) {
        return TodoListDto.of(todoListRepository.save(todoListDto.toEntity()));
    }


}
