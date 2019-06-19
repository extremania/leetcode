package com.github.extermania.leetcode;

public class $0321_Create_Maximum_Number_5_10 {
	class Solution {
	    
		int find(int[] arr, int n, int a) {
			for (int i = n; i < arr.length; i++) {
				if (arr[i] == a)
					return i;
			}
			return -1; // never
		}

		int[] f(int[] arr, int n, int k) {
			if (k == 0)
				return new int[] {};
			int len = arr.length - n;
			if (len < k)
				return new int[] {};
			if (len == k) {
				int[] rst = new int[k];
				System.arraycopy(arr, n, rst, 0, arr.length - n);
				return rst;
			} else {
				int[] ts = new int[10];
				for (int i = n; i < arr.length; i++)
					ts[arr[i]]++;
				for (int i = 9; i >= 0; i--) {
					if (ts[i] > 0) {
						int fi = find(arr, n, i);
						int[] next = f(arr, fi + 1, k - 1);
						// System.out.println(fi + "+" + Arrays.toString(next));
						if (next.length == k - 1) {
							int[] rst = new int[k];
							rst[0] = i;
							System.arraycopy(next, 0, rst, 1, next.length);
							return rst;
						}
					}
				}
			}
			return new int[] {}; // never
		}

		int[] combine(int[] nums1, int[] nums2) {
			int[] nums = new int[nums1.length + nums2.length];
			int p1 = 0;
			int p2 = 0;
			int i = 0;
			while (p1 < nums1.length || p2 < nums2.length) {
				if (p1 >= nums1.length)
					nums[i++] = nums2[p2++];
				else if (p2 >= nums2.length)
					nums[i++] = nums1[p1++];
				else {
					if (nums1[p1] == nums2[p2]) {
						boolean big1 = true;
						for (int j = 0; p1 + j < nums1.length && p2 + j < nums2.length; j++) {
							//System.out.println(nums1[p1 + j] + " " + nums2[p2 + j]);
							if (nums1[p1 + j] > nums2[p2 + j])
								break;
							if (nums2[p2 + j] > nums1[p1 + j]) {
								big1 = false;
								break;
							}
	                        if(p1+j==nums1.length-1 && p2+j<nums.length){
	                            big1 = false; 
	                            break;
	                        }
						}
						if (big1)
							nums[i++] = nums1[p1++];
						else
							nums[i++] = nums2[p2++];
					} else if (nums1[p1] > nums2[p2])
						nums[i++] = nums1[p1++];
					else
						nums[i++] = nums2[p2++];
				}
				// System.out.println(Arrays.toString(nums));
			}
			return nums;
		}

		int[] max(int[] a, int[] b) {
			for (int i = 0; i < a.length; i++) {
				int a0 = a[i];
				int b0 = b[i];
				if (a0 > b0) {
					return a;
				}
				if (b0 > a0)
					return b;
			}
			return a;
		}

		public int[] maxNumber(int[] nums1, int[] nums2, int k) {

			int[] max = new int[k];

			int k0 = Math.min(nums1.length, k);
			for (int i = 0; i <= k0; i++) {
				if (k - i > nums2.length)
					continue;
				// System.out.println(i + " " + (k - i));
				int[] l1 = f(nums1, 0, i);
				int[] l2 = f(nums2, 0, k - i);
				// System.out.println("l1:" + Arrays.toString(l1));
				// System.out.println("l2:" + Arrays.toString(l2));
				int[] rst = combine(l1, l2);
				max = max(rst, max);
				// System.out.println("max: " + Arrays.toString(max));
			}

			return max;
		}
	}
}
