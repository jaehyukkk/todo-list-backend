package com.example.todolistbackend.todo.domain.dto;

import com.example.todolistbackend.todo.domain.entity.TodoList;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
@Setter
public class TodoListDto {

    private Long id;
    private String subject;
    private String content;
    private String startDt;
    private String endDt;
    private Boolean isEnable;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public TodoList toEntity() {
        return TodoList.builder()
                .id(id)
                .subject(subject)
                .content(content)
                .startDt(startDt)
                .endDt(endDt)
                .isEnable(isEnable)
                .build();
    }

    public static TodoListDto of(TodoList todoList) {
        TodoListDto todoListDto = new TodoListDto();
        todoListDto.setId(todoList.getId());
        todoListDto.setSubject(todoList.getSubject());
        todoListDto.setContent(todoList.getContent());
        todoListDto.setStartDt(todoList.getStartDt());
        todoListDto.setEndDt(todoList.getEndDt());
        todoListDto.setIsEnable(todoList.getIsEnable());
        todoListDto.setCreatedDate(todoList.getCreatedDate());

        return todoListDto;
    }
}
