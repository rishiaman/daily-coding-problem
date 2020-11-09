package dailycodingproblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem1 {

	public static void main(String[] args) {

		int[] A = { 10, 17, 3, 7 };
		int k = 25;

		System.out.println(getResultUsingSubtraction(A, k));

	}

	
	static boolean getResultUsingTwoPointerAndSorting(int[] array, int sum) {
		Arrays.sort(array);
	//	[3,7,10,17]
		int l = 0, r = array.length - 1;
		while (l<r) {
			if (array[l] + array[r] < sum) {
				l++;
			} else if (array[l] + array[r] > sum) {
				r--;
			}else  if (array[l] + array[r] == sum){
				return true;
			}
		}

		return false;
	}
	
	
	static boolean getResultUsingSubtraction(int[] array, int sum) {
		
		Set<Integer> set = new HashSet<Integer>();
		// [10, 17, 3, 7 ]
		for(int i = 0;i<array.length;i++) {
			int temp = sum-array[i];
			if(set.contains(temp)) {
				return true;
			}
			set.add(array[i]);
		}
		
		return false;
	}

}
