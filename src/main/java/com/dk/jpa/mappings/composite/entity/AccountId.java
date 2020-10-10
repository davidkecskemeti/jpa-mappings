package com.dk.jpa.mappings.composite.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class AccountId implements Serializable {

    private String accountNumber;
    private String accountType;

}