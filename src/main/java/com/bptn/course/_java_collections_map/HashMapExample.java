package com.bptn.course._java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// create a map object
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);
		hashMap.put(null, 1);

		// display the result
		System.out.println(hashMap);
		// keySet
		for (String key : hashMap.keySet()) {
			System.out.println("Name: " + key + " Value: " + hashMap.get(key));
		}

		// print the value of key B
		System.out.println("The value of 'A': " + hashMap.get("A"));

		// update the value of Key B
		System.out.println("The updated value of B is: " + hashMap.put("B", 5));

		// Check to see if key exists
		if (hashMap.containsKey("D")) {
			System.out.println("The key 'B' exists in the map");
		} else {
			System.out.println("The key 'B' doesn't exists in the map");
		}

		// check if the key/value exists using contaons() method
		if (hashMap.containsValue(3)) {
			System.out.println("The key '3' exists in the map");
		} else {
			System.out.println("The key '3' doesn't exists in the map");
		}

		// use putIfAbsent if the key doesn't exist on the map
		// it add the key if doesn't exist
		hashMap.putIfAbsent("D", 4);

		System.out.println(hashMap);

		// Entry set
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value " + entry.getValue());
		}

	}

}

//preserve insertion ? No
//Allow multiple null values
//keys can only have maximum one null
//value can be duplicate 
//key cannot be duplicate
