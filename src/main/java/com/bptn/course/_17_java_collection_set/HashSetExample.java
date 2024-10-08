package com.bptn.course._17_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		// create an object of HashSet
		Set<String> hashSet = new HashSet<>();

		// add values to hashSet

		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple");

		hashSet.add(null);

		System.out.println("The HashSet of fruit: " + hashSet);

	}

}

//it allows max one null value
//it allows duplicate
//Insertion Order - No
//Underlying implementation - hash table
//HashSet is not indexed
