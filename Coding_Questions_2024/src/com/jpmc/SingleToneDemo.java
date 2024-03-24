package com.jpmc;

import java.io.Serializable;

class SingletonTest {
	private static SingletonTest singletonTest;

	private SingletonTest() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonTest getInstance() {
		if (singletonTest == null) {
			synchronized (SingletonTest.class) {
				if (singletonTest == null)
					singletonTest = new SingletonTest();
			}
		}
		return singletonTest;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Not able to create any object");
	}

}

public class SingleToneDemo {

	public static void main(String[] args) {
		SingletonTest singletonTest = SingletonTest.getInstance();
		System.out.println(singletonTest.hashCode());
		singletonTest=SingletonTest.getInstance();
		System.out.println(singletonTest.hashCode());

	}

}
