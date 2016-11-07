package com.unicorn.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String data;
    @Getter
    @Setter
    private LocalDateTime time = LocalDateTime.now();
    @Getter
    @Setter
    private TodoStatus status = TodoStatus.OPEN;

    public enum TodoStatus {
        OPEN,DONE
    }

}
