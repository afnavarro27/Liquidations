package com.spring.liquidation.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Worker")
public class Worker {

    @Id
    @NotNull
    @Column(name = "id", unique = true)
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column(name = "daysWorked")
    @NotNull
    private int daysWorted;


}
