package com.example.myproject.dao;

import com.example.myproject.entity.Dept01;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository <Dept01,Integer> {
}
