package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfoEntity, Long> {

}
