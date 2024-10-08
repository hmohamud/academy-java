package com.bptn.course._16_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		
		ArrayList<String> myBooks = new ArrayList<>();
		
		myBooks.add("Bleach");
		myBooks.add("HxH");
		myBooks.add("One Piece");
		
		
		System.out.print("My favorite books are: ");
		for(String i: myBooks) {
			if ( i.equals("One Piece")) {
				System.out.print("and " + i + ".");
				continue;
			}
			System.out.print(i + ", ");
		}
		
		//display the first book
		System.out.println("\n" + myBooks.get(0));
		
		//delete second book
		myBooks.remove(1);
		System.out.println(myBooks);
		
		//search for a book
		if(myBooks.contains("One Piece")) {
			System.out.println("Book Found");
		}else {
			System.out.println("Book not Found");
		}
		
		System.out.println("The size of the list is: " + myBooks.size());
		System.out.println("The last book is:" + myBooks.get(myBooks.size() -1));

	}

}
