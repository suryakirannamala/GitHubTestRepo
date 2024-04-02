package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRrepoProcess {
	@Autowired
	StudentInfoRepository studentInfoRepository;

	StudentInfoEntity saveStudentInfo(StudentInfoEntity studentInfoEntity) {

		return studentInfoRepository.save(studentInfoEntity);
	}
	
	
	List<StudentInfoEntity> getStudentInfo() {

		return studentInfoRepository.findAll();
	}

}
