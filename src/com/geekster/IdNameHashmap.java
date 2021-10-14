package com.geekster;
import java.util.*;
public class IdNameHashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Asutosh");
		map.put(2, "sanjay");
		map.put(3, "nipun");
		map.put(4, "akanksha");
		
		for(int i : map.keySet())
		{
			System.out.println(i +" - "+map.get(i));
		}
		
	}
}
