package com.seschool.online.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

//@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    @Column(
            updatable = false,
            nullable = false
    )
    private String createdBy;
    private String lastModifiedBy;

}
