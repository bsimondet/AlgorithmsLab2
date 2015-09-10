import java.util.Random;

public class randomizedQuickSort {

	private static int randomInRange(int lower,int upper){
		Random rand = new Random();
		return lower + rand.nextInt(upper - lower);
	}
	
	static long comparisonCount = 0;

	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		if (arr.length > 1) {
			quickSortRecursive(arr, 0, arr.length - 1);
		}
	}

	private static <T extends Comparable<T>> void quickSortRecursive(T[] arr,
			int left, int right) {
		if (right - left > 0) {
			// Step 1: set up swap pointer index
			int swapIndex = left;
			T pivotValue = arr[left];
			int r = randomInRange(left,right);

			// Step 2: swap pivot with the last value in the subarray */
			swap(arr, left, r);

			// Step 3: partition (hint: you'll need a loop)
			int currentIndex = left;
			while (currentIndex < right) {
				comparisonCount++;
				if (arr[currentIndex].compareTo(pivotValue) <= 0) {
					swap(arr, swapIndex, currentIndex);
					currentIndex++;
					swapIndex++;
				} else {
					currentIndex++;
				}
			}

			swap(arr, swapIndex, right);

			// Step 4: Make the recursive calls
			quickSortRecursive(arr, left, swapIndex - 1);
			quickSortRecursive(arr, swapIndex + 1, right);
		}
	}

	public static <T> void swap(T[] arr, int index1, int index2) {
		T temp = arr[index2];
		arr[index2] = arr[index1];
		arr[index1] = temp;
	}

}
