package com.bptn.course._31_file_handling;

import java.io.File;

public class FIleDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("sample.txt");

//		if (file.delete()) {
//			System.out.println("File Deleted!");
//		} else {
//			System.out.println("Cannot delete file!");
//		}

		if (file.exists()) {
			System.out.println("File found! Deleting now..");
			if (file.delete()) {
				System.out.println("File deleted!");
			}
		} else {
			System.out.println("File not found!");
		}

	}

}
