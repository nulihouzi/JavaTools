package com.eclipse.test;

/**
 * 演示各种GC回收器
 * <p>运行参数：
 * <p>-Xms10m -Xmx10m -XX:+UseSerialGC -XX:+PrintGCDetails
 * <p>-Xms10m -Xmx10m -Xmn8m -XX:+UseParNewGC -XX:+PrintGCDetails -XX:ParallelGCThreads=4
 * <p>-Xms10m -Xmx10m -Xmn8m -XX:+UseParallelGC -XX:+PrintGCDetails -XX:ParallelGCThreads=4
 * <p>-Xms10m -Xmx10m -Xmn8m -XX:+UseParallelGC -XX:+PrintGCDetails -XX:MaxGCPauseMillis=1
 * <p>-Xms10m -Xmx10m -Xmn8m -XX:+UseParallelGC -XX:+PrintGCDetails -XX:GCTimeRatio=99
 * <p>-Xms10m -Xmx10m -Xmn2m -XX:+UseParallelOldGC -XX:+PrintGCDetails -XX:GCTimeRatio=99
 * <p>-Xms10m -Xmx10m -Xmn2m -XX:+UseParallelOldGC -XX:+PrintGCDetails -XX:MaxGCPauseMillis=1
 * <p>-Xms10m -Xmx10m -Xmn2m -XX:+UseParallelOldGC -XX:+PrintGCDetails -XX:ParallelGCThreads=4
 * <p>-Xms10m -Xmx10m -Xmn512k -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:CMSInitiatingOccupancyFraction=1
 * <p>-Xms10m -Xmx10m -Xmn512k -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:ParallelGCThreads=4
 * <p>-Xms10m -Xmx10m -Xmn512k -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:ConcGCThreads=1
 * <p>-Xms10m -Xmx10m -Xmn512k -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:ParallelCMSThread=1
 * <p>-Xms10m -Xmx10m -Xmn512k -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+UseCMSCompactAtFullCollection
 * <p>-Xms10m -Xmx10m -Xmn512k -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:CMSFullGCsBeforeCompaction=2
 * <p>-Xms10m -Xmx10m -Xmn512k -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+CMSClassUnloadingEnabled
 * 
 * @author Miracle
 */
public class GarbageCollectorDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte[] arr = null;
		// dead loop
		for (;;) {
			arr = new byte[1024 * 1024 * 1];
		}
	}
}