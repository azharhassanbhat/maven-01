package com.azhar;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A {

	public static void main(String[] args) {
	String s="hello";
	String rev = reverseString(s);
	System.out.println(rev);
	}
	
	public static String reverseString(String s) {
		if(s==null||s.length()<=1) {
			return s;
		}
		return reverseString(s.substring(1))+s.charAt(0);
	}
}
