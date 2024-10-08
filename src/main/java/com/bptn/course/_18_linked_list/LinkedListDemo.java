package com.bptn.course._18_linked_list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// create
		LinkedList<String> myList = new LinkedList<>();

		// insert
		myList.add("T1");
		myList.add("T2");
		myList.add("T3");
		myList.addFirst("T0");
		myList.addLast("T10");
		myList.add(2, "T4");
		myList.add("T2");

		// System.out.println(myList);

//		Iterator<String> iterator = myList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

//		System.out.println(myList.get(1));
//		System.out.println(myList.element());

//		myList.remove();
//		myList.remove(2);
		myList.removeFirstOccurrence("T2");
		System.out.println(myList);

	}

}
