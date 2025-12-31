import java.util.*;

public class TwoSum {
	public static void main (String[] args) {
		int[] arr = {1,2,3,5,6,7};
		System.out.println(Arrays.deepToString(twoSum(arr)));
		}
	
	public static int[][] twoSum(int[] arr){
	int target = 11;
	int length = arr.length;
	for (int i = 0; i < length; i++){
		for(int j = i + 1; j < length; j++){
			if(arr[i] + arr[j] == target){
			return new int[][]{{i,j}};
		}
	}	
	}
	return null;
 }
 }
