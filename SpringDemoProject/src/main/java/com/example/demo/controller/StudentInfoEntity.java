package com.example.demo.controller;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EnableAutoConfiguration
@Table(name = "STUDENT_TEST")
@Entity
public class StudentInfoEntity implements Serializable{
	private static final long serialVersionUID = -1660952520347040199L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;

//	@Column(name = "FIRSTNAME", nullable = false)
	private String FIRSTNAME;
	@Column(nullable = false)
	private String MIDDLENAME;
	@Column(nullable = false)
	private String LASTNAME;

	// @Column(nullable = false, unique = true)
	@Column(nullable = true)
	private Timestamp CREATEDDATE;
	@Column(nullable = true)
	private String CREATEDUSER;

	@Column(nullable = true)
	private Timestamp UPDATEDDATE;
	@Column(nullable = true)
	private String UPDATEDUSER;

	@Column(nullable = true)
	private Byte ACTIVESTATUS;

	@Column(name = "FIRSTNAME", nullable = false)

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}

	public String getMIDDLENAME() {
		return MIDDLENAME;
	}

	public void setMIDDLENAME(String mIDDLENAME) {
		MIDDLENAME = mIDDLENAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}

	public Timestamp getCREATEDDATE() {
		return CREATEDDATE;
	}

	public void setCREATEDDATE(Timestamp cREATEDDATE) {
		CREATEDDATE = cREATEDDATE;
	}

	public String getCREATEDUSER() {
		return CREATEDUSER;
	}

	public void setCREATEDUSER(String cREATEDUSER) {
		CREATEDUSER = cREATEDUSER;
	}

	public Timestamp getUPDATEDDATE() {
		return UPDATEDDATE;
	}

	public void setUPDATEDDATE(Timestamp uPDATEDDATE) {
		UPDATEDDATE = uPDATEDDATE;
	}

	public String getUPDATEDUSER() {
		return UPDATEDUSER;
	}

	public void setUPDATEDUSER(String uPDATEDUSER) {
		UPDATEDUSER = uPDATEDUSER;
	}

	public Byte getACTIVESTATUS() {
		return ACTIVESTATUS;
	}

	public void setACTIVESTATUS(Byte aCTIVESTATUS) {
		ACTIVESTATUS = aCTIVESTATUS;
	}

}
