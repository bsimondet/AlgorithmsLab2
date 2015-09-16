public class insertionQuickSort {
	
	static long comparisonCount = 0;

	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		if (arr.length > 1) {
			quickSortRecursive(arr, 0, arr.length - 1) ;
		}
	}
	
	private static <T extends Comparable<T>> void quickSortRecursive(T[] arr, int left, int right) {
		if (right - left > 0) {
			int swapIndex = left;
			T pivotValue = arr[left];

			swap(arr, left, right);

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

			quickSortRecursive(arr, left, swapIndex - 1);
			quickSortRecursive(arr, swapIndex + 1, right);
		}
	}
	public static <T> void swap(T[] arr, int index1, int index2) {
		T temp = arr[index2];
		arr[index2] = arr[index1];
		arr[index1] = temp;
	}
	
	public static <T> void insertionSort(TestInteger[] arr){
		for (int i = 1; i < arr.length; i++){
			TestInteger key = arr[i];
			int j = i - 1;
			while (j > 0 && arr[j].toInt() > key.toInt()){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

}
