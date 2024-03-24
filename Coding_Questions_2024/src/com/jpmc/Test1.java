package com.jpmc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Hyderabad", "Banglore", "Pune", "Kolkata");
		Map<Object, Object> collect = names.stream().collect(Collectors.toMap(name -> name, name -> name.length()));
		System.out.println(collect);

		List<Integer> nums = Arrays.asList(12, 34, 56, 67, 45, 4, 56, 23);
		Optional<Integer> sum = nums.stream().reduce((num1, num2) -> num1 + num2);
		System.out.println(sum.get());

	}

}
