```java
class Solution {
	public int search(int[] nums, int target) {
		int n = nums.length;
		if (n == 0) {
			return -1;
		}
		if (n == 1) {
			return target == nums[0] ? 0 : -1;
		}
		int l = 0, r = n -1;
		while (l <= r) { // 注意，二分查找，l 需要小于等于 r，等于的情况也要考虑
			int mid = ((r - l) >> 1 ) + l ;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[0] <= nums[mid]) {
				if (nums[0] <= target && target < nums[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			} else {
				if (nums[mid] < target && target <= nums[n - 1]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}
}
```


