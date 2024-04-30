package com.string;

import java.util.StringJoiner;

public class Demo13 {

	public static void main(String[] args) {
		StringJoiner s = new StringJoiner(",");
		s.add("Hello");
		s.add("World");
		System.out.println(s.toString());
	}
}
