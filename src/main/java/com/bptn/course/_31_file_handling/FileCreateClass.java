package com.bptn.course._31_file_handling;

import java.io.FileWriter;
import java.io.IOException;

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentID() {
		return String.valueOf(studentID);
	}

	public String getStudentName() {
		return studentName;
	}
}

public class FileCreateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student myStudent = new Student(123, "TestStudent");

		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("This is a new file\n");
			writer.write(myStudent.getStudentID() + "\n");
			writer.write(myStudent.getStudentName() + "\n");
			System.out.println("File created!");
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: ");
			e.printStackTrace();
		}
	}

}
