package com.jpmc;

final class MyImmutableTest {
	private final String name;

	public MyImmutableTest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
}

public class ImmutableDemo {
	public static void main(String[] args) {
		MyImmutableTest obj1=new MyImmutableTest("Aakash");
	}
}