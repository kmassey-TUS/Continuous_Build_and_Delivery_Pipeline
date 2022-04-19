package com.tus.game.entity;

public class SleepUtils {

	public static void sleep(int delayMs) {
		try {
			Thread.sleep(delayMs);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
