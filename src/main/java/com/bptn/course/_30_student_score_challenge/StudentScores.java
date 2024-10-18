package com.bptn.course._30_student_score_challenge;

import java.util.HashMap;
import java.util.Map;

public class StudentScores {

	public static double calculateAvg(Student student, Map<String, Double> scores) {
		double sum = 0;
		for (Double score : scores.values()) {
			sum += score;
		}
		return sum / scores.size();
	}

	public static void main(String[] args) {
		Map<String, Double> scores = new HashMap<>();
		scores.put("course1", 90.0);
		scores.put("course2", 75.5);
		scores.put("course3", 98.3);
		Student s1 = new Student("Student One", scores);

		System.out.printf("The average score is: %.2f", calculateAvg(s1, scores));
	}

}
