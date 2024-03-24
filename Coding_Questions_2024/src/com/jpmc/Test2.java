package com.jpmc;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		String str = "Good";
		String[] split = str.split("");
		Map<String, Long> collect = Arrays.stream(split)
				.collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
		String string = Arrays.stream(split).filter(naam -> collect.get(naam) == 1).reduce((a, b) -> a + "," + b).get();
		System.out.println(string);
	}
}