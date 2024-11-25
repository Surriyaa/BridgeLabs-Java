package com.java8;


import java.util.Optional;

public class OptionalClass {
	public static void usingEmpty() {
		Optional<String> empty=Optional.empty();
		System.out.println("This is for empty "+empty.isEmpty());;
	}
	
	public static void usingOf() {
		String name="Surriyaa";
		Optional<String> nonNull=Optional.of(name);
		System.out.println("This is the presence of statement "+nonNull.isPresent());
	}
	
	private static void usingOfNullable() {
		String name=null;
		Optional<String> ofNull=Optional.ofNullable(name);
		System.out.println("This is for of Nullable "+ofNull.isEmpty());
	}

	public static void main(String[] args) {
		usingEmpty();
		usingOf();
		usingOfNullable();
	}

	

}
