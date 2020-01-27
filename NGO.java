package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component("stepPersonalDetails")
@Table(name = "Step_Personal_Details")
@SequenceGenerator(name = "seq_ngo", sequenceName = "seq_ngo", allocationSize = 1, initialValue = 1)
public class NGO {
	@Id
	@Column(name = "ngo_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ngo")
	private int ngoId;
	@Column(name = "organization_name")
	private String organizationName;
	@Column(name = "organization_head")
	private String organizationHead;
	@Column(name = "designation")
	private String designation;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile_number")
	private int mobileNumber;
	@Column(name = "address")
	private String address;
	@Column(name = "account_holder")
	private String accountHolder;
	@Column(name = "account_no")
	private String accountNumber;
	@Column(name = "bank_name")
	private String bankName;
	@Column(name = "branch_name")
	private String branchName;
	@Column(name = "branch_city")
	private String branchCity;
	@Column(name = "IFSC_code")
	private String ifscCode;
	@Column(name = "project_name")
	private String projectName;
	@Column(name = "project_incharge_Name")
	private String projectInchargeName;
	public NGO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NGO(int ngoId, String organizationName, String organizationHead, String designation, String email,
			int mobileNumber, String address, String accountHolder, String accountNumber, String bankName,
			String branchName, String branchCity, String ifscCode, String projectName, String projectInchargeName) {
		super();
		this.ngoId = ngoId;
		this.organizationName = organizationName;
		this.organizationHead = organizationHead;
		this.designation = designation;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.branchName = branchName;
		this.branchCity = branchCity;
		this.ifscCode = ifscCode;
		this.projectName = projectName;
		this.projectInchargeName = projectInchargeName;
	}
	public int getNgoId() {
		return ngoId;
	}
	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationHead() {
		return organizationHead;
	}
	public void setOrganizationHead(String organizationHead) {
		this.organizationHead = organizationHead;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCity() {
		return branchCity;
	}
	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectInchargeName() {
		return projectInchargeName;
	}
	public void setProjectInchargeName(String projectInchargeName) {
		this.projectInchargeName = projectInchargeName;
	}
	@Override
	public String toString() {
		return "NGO [ngoId=" + ngoId + ", organizationName=" + organizationName + ", organizationHead="
				+ organizationHead + ", designation=" + designation + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", accountHolder=" + accountHolder + ", accountNumber="
				+ accountNumber + ", bankName=" + bankName + ", branchName=" + branchName + ", branchCity=" + branchCity
				+ ", ifscCode=" + ifscCode + ", projectName=" + projectName + ", projectInchargeName="
				+ projectInchargeName + "]";
	}
	
	
	
}
