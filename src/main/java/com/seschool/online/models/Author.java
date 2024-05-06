package com.seschool.online.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
//@Table(name = "AUTHOR_TBL") only for custom table name
public class Author {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            name = "f_name"
    )
    private String firstName;

    @Column(
            name = "l_name"
    )
    private String lastName;

    @Column(
            unique = true,
            nullable = false,
            length = 30
    )
    private String email;
    private Integer age;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            insertable = false
    )
    private LocalDateTime lastModied;

}
