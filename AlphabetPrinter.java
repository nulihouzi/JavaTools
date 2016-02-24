package com.eclipse.test;

/**
 * 以字母表顺序依次打印字母
 * 
 * @author 张奇
 * Created on 2016-02-22 16:05.
 */
public class AlphabetPrinter {
	public static void main(String[] args) {
		AlphabetRunnable runnable = new AlphabetRunnable();
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread(runnable, "线程" + (i + 1));
			thread.start();
		}
	}
}