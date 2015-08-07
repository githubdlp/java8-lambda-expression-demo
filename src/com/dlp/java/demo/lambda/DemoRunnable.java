package com.dlp.java.demo.lambda;

public class DemoRunnable {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Started thread-1")).start();
		new Thread(() -> {
			System.out.println("Started thread-2a");
			System.out.println("Started thread-2b");
		}).start();
	}
}
