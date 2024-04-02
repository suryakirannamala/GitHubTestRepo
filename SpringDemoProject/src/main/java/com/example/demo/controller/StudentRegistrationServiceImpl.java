package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentRegistrationService")
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	private StudentInfoRepository studentInfoRepository;

	@Override
	public StudentInfoEntity saveStudentInfo(StudentInfoEntity studentInfoEntity) {

		return studentInfoRepository.save(studentInfoEntity);
	}

	@Override
	public StudentInfoEntity updateStudentInfo(StudentInfoEntity studentInfoEntity, Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentInfoEntity> getStudentInfo() {


		List<StudentInfoEntity> slist = new ArrayList<StudentInfoEntity>();
		StudentInfoEntity studentInfoEntity = new StudentInfoEntity();
		studentInfoEntity.setFIRSTNAME("test1");
		StudentInfoEntity studentInfoEntity11 = new StudentInfoEntity();
		studentInfoEntity.setFIRSTNAME("test1");
		slist.add(studentInfoEntity);
		slist.add(studentInfoEntity11);
		
		return slist;

	}

	@Override
	public StudentInfoEntity getStudentInfoById(Long studentId) {
		
		StudentInfoEntity studentInfoEntity = new StudentInfoEntity();
		studentInfoEntity = studentInfoRepository.getById(studentId);
		
		return studentInfoEntity;
	}

	@Override
	public void deleteStudentInfo(Long studentId) {
		// TODO Auto-generated method stub

	}

}
