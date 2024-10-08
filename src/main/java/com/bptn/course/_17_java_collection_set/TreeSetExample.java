package com.bptn.course._17_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		// Create an object of TreeSet

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("mango");
		treeSet.add("cherry");
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("pinapale");

		treeSet.add("mango");

		System.out.println("TreeSet is : " + treeSet);

	}

}

//It preserves acsending order
//it dose not allow to add null values 
//it does not accept duplicates 
//underlying implementation is TreeMap