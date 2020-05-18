package com.acme.basic;

public class HelloWorld {

	public static void sayHello() {
		System.out.println("Hello World!");
	}

	public static void notCovered() {
		System.out.println("This method is not covered by unit tests");
	}

	public static int[] searchRange(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return new int[] { -1, -1 };
		int first = findFirst(nums, target);
		if (first == -1)
			return new int[] { -1, -1 };
		int last = findLast(nums, target);
		return new int[] { first, last };
	}

	public static int findFirst(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start + 1 < end) {
			int mid = (end - start) / 2 + start;
			if (nums[mid] < target) {
				start = mid;
			} else
				end = mid;
		}
		if (nums[start] == target)
			return start;
		if (nums[end] == target)
			return end;
		return -1;
	}

	public static int findLast(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start + 1 < end) {
			int mid = (end - start) / 2 + start;
			if (nums[mid] > target) {
				end = mid;
			} else
				start = mid;
		}

		if (nums[end] == target)
			return end;
		if (nums[start] == target)
			return start;
		return -1;
	}

}
