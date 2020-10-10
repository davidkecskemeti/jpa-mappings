package com.dk.jpa.mappings.composite.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(callSuper = true)
public class Employee implements Serializable {

    @EmbeddedId
    private EmployeeId employeeId;

    private String name;

    @Column(unique = true)
    private String email;

    private String phoneNumber;
}
