package com.bptn.course._18_linked_list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		// Create a LinkedList of Strings
		LinkedList<String> placesToEat = new LinkedList<>();
//
		placesToEat.add("Nandos");
		placesToEat.add("Chick Fil A");
		placesToEat.add("Wendys");

//		// Standard iteration using For Loop
		System.out.println("Using a For Loop to print out our LinkedList:");
		for (int i = 0; i < placesToEat.size(); i++) {
			System.out.println(placesToEat.get(i));
		}

//		// Another iteration using For-Each Loop
		System.out.println("\nUsing a For-Each Loop to print out our LinkedList:");
		for (String store : placesToEat) {
			System.out.println(store);
		}

//		// Standard iteration using For Loop
		System.out.println("\nUsing a For Loop to print out our LinkedList in reverse:");
		for (int i = placesToEat.size() - 1; i >= 0; i--) {
			System.out.println(placesToEat.get(i));
		}

		placesToEat.remove("Wendys");
		System.out.println(placesToEat);

	}

}
