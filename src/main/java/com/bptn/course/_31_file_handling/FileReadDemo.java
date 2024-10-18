package com.bptn.course._31_file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader reader = new FileReader("sample.txt");
			BufferedReader buffer = new BufferedReader(reader);

			String line;

			while ((line = buffer.readLine()) != null) {
				// Student testStudent = new Student(123, line);
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Something went wrong while attempting to read: " + e.getMessage());
		}

	}

}
