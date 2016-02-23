package com.eclipse.test;

import java.util.Arrays;

/**
 * 使用二分法确定元素的位置
 * 二分法适用于数据量较大的情况
 * 使用二分法的数组需已排序
 * 
 * @author Miracle
 * Created on 2015-02-23 20:04.
 */
public class DichotomyDemo {
	/**
	 * 获取元素在数组中的位置
	 * 
	 * @param arr 已排序数组
	 * @param element 元素
	 * @param front 起始下标
	 * @param end 终止下标
	 * @return 元素下标
	 */
	private int getArrIndexOfElement(int[] arr, int element, int front, int end) {
		// 参数异常
		if (arr == null || front < 0 || end < 0) {
			throw new IllegalArgumentException();
		}
		// 数组中不包含此元素
		if (arr.length == 0 || front > end) {
			return -1;
		}
		
		// 获取中位下标
		int middle = (front + end) / 2;
		int middleElement = arr[middle];
		// 获取到元素
		if (element == middleElement) {
			return middle;
		}
		if (element > middleElement) {
			front = middle + 1;
		}
		if (element < middleElement) {
			end = middle - 1;
		}
		
		return getArrIndexOfElement(arr, element, front, end);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 13, 56, 77, 55, 33, 22, 15, 90, 69, 47, 73, 99, 87, 0, -23};
		Arrays.sort(arr);
		int element = 22;
		int front = 0;
		int end = arr.length - 1;
		System.out.println(new DichotomyDemo().getArrIndexOfElement(arr, element, front, end));
	}
}