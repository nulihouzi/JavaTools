package com.eclipse.test;

/**
 * 以字母表顺序依次打印字母
 * 
 * @author 张奇
 * Created on 2016-02-22 16:04.
 */
public class AlphabetRunnable implements Runnable {
	// 全局锁
	private static final Object LOCK = new Object();
	// 索引
	private static int index = 0;
	// 字母数组
	private static String[] alphabetArr = {
			"A",
			"B",
			"C",
			"D",
			"E",
			"F",
			"G",
			"H",
			"I",
			"J",
			"K",
			"L",
			"M",
			"N",
			"O",
			"P",
			"Q",
			"R",
			"S",
			"T",
			"U",
			"V",
			"W",
			"X",
			"Y",
			"Z"
	};
	
	@Override
	public void run() {
		while (true) {
			synchronized (LOCK) {
				if (index >= alphabetArr.length) {
					break;
				}
				System.out.println(Thread.currentThread().getName() + ": " + alphabetArr[index]);
				index++;
			}
		}
	}
}