package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringTestControllerNewMap")
public class SpringTestControllerNewMap {

	@Autowired
	ServiceRrepoProcess serviceRrepoProcess;

	@GetMapping
	String getTestString() {
		return "Hello";
	}

	@PostMapping("/saveStudent}")
	public ResponseEntity<StudentInfoEntity> saveStudentInfo(@RequestBody StudentInfoEntity studentInfoEntity) {

		return new ResponseEntity<>(serviceRrepoProcess.saveStudentInfo(studentInfoEntity), HttpStatus.CREATED);
	}

	@GetMapping("/getStudents")
	public ResponseEntity<List<StudentInfoEntity>> getStudents() {

		return new ResponseEntity<>(serviceRrepoProcess.getStudentInfo(), HttpStatus.OK);
	}

}
