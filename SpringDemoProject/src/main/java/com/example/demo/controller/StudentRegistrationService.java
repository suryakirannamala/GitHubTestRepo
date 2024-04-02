package com.example.demo.controller;

import java.util.List;

public interface StudentRegistrationService {

	StudentInfoEntity saveStudentInfo(StudentInfoEntity studentInfoEntity);

	StudentInfoEntity updateStudentInfo(StudentInfoEntity studentInfoEntity, Long studentId);

	List<StudentInfoEntity> getStudentInfo();

	StudentInfoEntity getStudentInfoById(Long studentId);

	void deleteStudentInfo(Long studentId);
}
