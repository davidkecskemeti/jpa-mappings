package com.dk.jpa.mappings.composite.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@IdClass(AccountId.class)
@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

    @Id
    private String accountNumber;

    @Id
    private String accountType;

    private double balance;
}
