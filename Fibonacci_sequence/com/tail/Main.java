package com.tail;

public class Main {
	public static long fib(long n) {
		if(n <= 1) return n;
		long first = 0;
		long second = 1;
		for (long i = 0; i < n - 1; i++) {
			long sum = first + second;
			first = second;
			second = sum;
		}
		return second;
	}
	public static void main(String[] args) {
		System.out.println(fib(64));
	}
}
