import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints

		int[][] nums = new int[3][5];

		// Fill the array with random numbers using fillRandom

		int low = 1;
		int high = 100;

		fillRandom(nums, low, high);
		print(nums);

		int row = 0;
		System.out.println("Sum of the the " + row + " numbered row = " + sum(nums, row) + "\n");

		System.out.print("Array of the sums of all rows is: ");
		print1D(sums2DArray(nums));

		System.out.println();

		System.out.println(isUnique(nums) + "\n");

		System.out.println("Min =" + min(nums) + "\n");
		System.out.println("Max= " + max(nums));

		// test each method you create below.

	}
	/*
	 * given the lower and upper bounds of the random numbers fill an array of
	 * random numbers
	 */

	public static void fillRandom(int[][] arr, int low, int high) {

		Random random = new Random();
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[0].length; col++) {

				arr[row][col] = random.nextInt(high) + low;
			}

		}

	}

	/*
	 * create a method that prints a 2D array
	 */
	public static void print(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			System.out.print("{\t");
			for (int col = 0; col < arr[0].length; col++) {

				System.out.print(arr[row][col] + "\t");
			}

			System.out.println("}");
		}

		System.out.println();
	}
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */

	public static int sum(int[][] nums, int row) {

		int total = 0;

		for (int i = 0; i < nums[row].length; i++) {

			total = total + nums[row][i];

		}

		return total;

	}

	/*
	 * return an array of row sums of a 2D array (nums)
	 */

	public static int arraySum(int[] arr) {
		int sum = 0;
		for (int item : arr) {

			sum += item;

		}
		return sum;
	}

	public static int[] sums2DArray(int[][] arr2) {

		int[] sums = new int[arr2.length];

		int i = 0;

		for (int[] eachRow : arr2) {
			sums[i] = arraySum(eachRow);
			i++;
		}

		return sums;
	}

	public static void print1D(int[] x) {
		System.out.print("{\t");

		for (int item : x) {
			System.out.print(item + "\t");
		}

		System.out.println("}");

	}

	/*
	 * check an 2D array for repeats, return true if all elements of the array
	 * are unique
	 */

	public static boolean isUnique(int[][] nums) {

		for (int row = 1; row < nums.length - 1; row++) {

			for (int col = 1; col < nums[0].length - 1; col++) {

				if (nums[row - 1][col - 1] == nums[row][col])
					return false;

			}

		}
		return true;
	}

	/*
	 * given an array return the index of the target value, return -1 if it is
	 * not found
	 */

	public static int index(int[] arr, int target) {
		int index = -1;

		for (int i = 0; i < arr.length; i++) {

			arr[i] = target;
			index = i;

		}

		return index;
	}

	/*
	 * return the min value in a 2D array
	 */
	public static int min(int[][] nums) {
		int min = 100;

		for (int row = 0; row < nums.length; row++) {

			for (int col = 0; col < nums[0].length; col++) {

				if (nums[row][col] < min) {

					min = nums[row][col];
				}
			}
		}
		return min;
	}

	/*
	 * return the max value in a 2D array
	 */
	public static int max(int[][] nums) {
		int max = 0;

		for (int row = 0; row < nums.length; row++) {

			for (int col = 0; col < nums[0].length; col++) {

				if (nums[row][col] > max) {

					max = nums[row][col];
				}
			}
		}
		return max;
	}

}
