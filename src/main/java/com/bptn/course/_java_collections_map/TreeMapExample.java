package com.bptn.course._java_collections_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Sam", 23);
		treeMap.put("Steve", 23);
		treeMap.put("Terry", 23);
		treeMap.put("Dan", 23);
		treeMap.put("Dan", 24);
		treeMap.put("Messi", null);
		// treeMap.put(null, 29);

		System.out.println(treeMap);

		// Access element in the map
		System.out.println("Sam's Age is: " + treeMap.get("Sam"));

		// access the first key of the map

		System.out.println("The first key is: " + treeMap.firstKey());

		// access the first entry
		System.out.println("The first key is: " + treeMap.firstEntry());

	}

}

//natural acsending order of the keys 
// it doesnt allow null value for the key
// it allow null value of Value
// it doesnt allow duplicate keys 
