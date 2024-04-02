package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/students")
public class TestSpringController {

	@Autowired
	public TestDp testDp;

	@Autowired
	StudentRegistrationService studentRegistrationService;

	// @PostMapping("/samplePost")
	public String postResponseTest() {
		return testDp.methotTest();
	}

	@GetMapping("/sampleGet")
	public String getResponseTest() {
//		return "Hello CodeBEgun sampleGet";
		return testDp.methotTest();
	}

	@GetMapping("/getStudent/{studentid}")
	public ResponseEntity<StudentInfoEntity> getStudentsById(@PathVariable("studentid") Long studentId) {

		return new ResponseEntity<>(studentRegistrationService.getStudentInfoById(studentId), HttpStatus.OK);
	}

	@GetMapping("/getAllStudents")
	public ResponseEntity<List<StudentInfoEntity>> getAllStudents() {
		
		List<StudentInfoEntity> slist = new ArrayList<StudentInfoEntity>();
		StudentInfoEntity studentInfoEntity = new StudentInfoEntity();
		studentInfoEntity.setFIRSTNAME("test1");
		StudentInfoEntity studentInfoEntity11 = new StudentInfoEntity();
		studentInfoEntity.setFIRSTNAME("test1");
		slist.add(studentInfoEntity);
		slist.add(studentInfoEntity11);

		return new ResponseEntity<>(slist, HttpStatus.OK);
	}

//	@PostMapping("/saveStudent")
//	@PostMapping
	@PostMapping(value = "/saveStudent")
	public ResponseEntity<StudentInfoEntity> saveStudent(@RequestBody StudentInfoEntity studentInfoEntity) {

//		studentInfoEntity.setFIRSTNAME("TESTCB");
//		studentInfoEntity.setMIDDLENAME("CBSURYATEst");
//		studentInfoEntity.setLASTNAME("N");
//		studentInfoEntity.setACTIVESTATUS((byte) 1);
//		studentInfoEntity.setCREATEDDATE(new Timestamp(new Date().getTime()));
//		studentInfoEntity.setUPDATEDDATE(new Timestamp(new Date().getTime()));
//		studentInfoEntity.setCREATEDUSER("SURYA");
//		studentInfoEntity.setUPDATEDUSER("SURYA");
		StudentInfoEntity savedtudentInfoEntity = studentRegistrationService.saveStudentInfo(studentInfoEntity);
		return new ResponseEntity<>(savedtudentInfoEntity, HttpStatus.CREATED);
	}

}
