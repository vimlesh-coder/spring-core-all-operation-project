package com.springcore;

public class Student
{
	private int studentId;
	private String studentName;
	private String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId)
	{
		System.out.println("setting student Id");// IOC Container backgraund me work kar rha hota hai
		this.studentId = studentId;
	}
	public String getStudentName() 
	{
		
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		System.out.println("setting student name");// isse pata chalta hai ki setter injection use hota hai
		this.studentName = studentName;
	}
	public String getStudentAddress()
	{
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress)
	{
		System.out.println("setting student address");
		this.studentAddress = studentAddress;
	} 
	public Student(int studentId, String studentName, String studentAddress) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studetName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
// 3 ab xml file banayenge
	//agar to stfring methos ko hata den to character value print ho jayegee
	// agar nhi hatate hain to value jo hotee hai vah real me store ho jatii hai
}
