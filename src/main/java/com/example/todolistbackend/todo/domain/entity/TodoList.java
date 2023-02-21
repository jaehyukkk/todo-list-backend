package com.example.todolistbackend.todo.domain.entity;

import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Log4j2
@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String subject;
    @Column(nullable = false, length = 2000)
    private String content;
    private String startDt;
    private String endDt;
    @Setter
    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean isEnable = true;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @Builder
    public TodoList(Long id, String subject, String content, String startDt, String endDt, Boolean isEnable) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        this.startDt = startDt;
        this.endDt = endDt;
        this.isEnable = isEnable;
    }
}
