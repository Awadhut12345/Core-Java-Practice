package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//abc, pqr, xyz


public class Demo14 {
	public static void main(String[] args) {
		List<String> listary = Arrays.asList("abc", "pqr", "xyz");
		String str = listary.stream().collect(Collectors.joining(","));
		System.out.println(str);
	}

}
