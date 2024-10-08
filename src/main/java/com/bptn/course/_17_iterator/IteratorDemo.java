package com.bptn.course._17_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myBooks = new ArrayList<>();
		
		myBooks.add("Bleach");
		myBooks.add("HxH");
		myBooks.add("One Piece");
		
		Iterator<String> iterator = myBooks.iterator();
		
		while(iterator.hasNext()) {
			String bookName = iterator.next();
			System.out.println(bookName);
		}

	}

}
