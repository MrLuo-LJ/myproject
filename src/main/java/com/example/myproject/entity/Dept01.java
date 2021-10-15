package com.example.myproject.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Dept01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptno;
    private String dname;
    private String loc;
    private String kk;
}
