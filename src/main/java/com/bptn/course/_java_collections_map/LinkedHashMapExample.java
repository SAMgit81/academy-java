package com.bptn.course._java_collections_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		// linkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Sam", 23);
		linkedHashMap.put("Steve", 23);
		linkedHashMap.put("Terry", 23);
		linkedHashMap.put("Dan", 23);
		linkedHashMap.put("Messi", 23);
		linkedHashMap.put(null, 29);

		System.out.println(linkedHashMap);

		// access Terry Age
		System.out.println("Terry age is: " + linkedHashMap.get("Terry"));

		// using for-each loop

		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("Name: " + entry.getKey() + ", Age " + entry.getValue());
		}

	}

}

//preserve insertion ? Yes
//allows duplicate value 
//Allow multiple null values
//keys can only have maximum one null
//value can be duplicate 
//key cannot be duplicate