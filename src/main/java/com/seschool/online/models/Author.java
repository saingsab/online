package com.seschool.online.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@Table(name = "AUTHOR_TBL") only for custom table name
public class Author extends BaseEntity {

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
            insertable = false
    )

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
