package com.bptn.course._19_hash_set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> mySet = new HashSet<>();

		mySet.add("TO");
		mySet.add("VAN");
		mySet.add("HAMI");

		System.out.println(mySet);

		System.out.println(mySet.contains("TO"));

		mySet.remove("HAMI");
		System.out.println(mySet);

	}

}
