package com.bptn.course._30_student_score_challenge;

import java.util.Map;

public class Student {

	private String name;
	private Map<String, Double> subjectScore;

	public Student(String name, Map<String, Double> subjectScore) {
		this.name = name;
		this.subjectScore = subjectScore;
	}

}
