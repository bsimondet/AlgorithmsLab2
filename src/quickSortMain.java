import java.util.Arrays;
import java.util.Random;

public class quickSortMain {

	public static void main(String[] args) {
		System.out.println("***Testing Integer Arrays of 100,000 Integers***");
		Integer[] randomInts1 = randomIntArray(100000);
		Integer[] randomInts2 = randomInts1.clone();
		Integer[] increasingInts = increasingArray(10000);
		testInteger[] randomTestInts = randomInts1.clone();
		
		System.out.println("Java's merge sort took " + javaSort(randomInts1) + " comparisons.");
		System.out.println("Our quick sort took " + testTime(randomInts2) + " comparisons.");
		System.out.println("Our quick sort with an increasing array took " + testTime(increasingInts) + " comparisons.");
		
		System.out.println("***Testing Integer Arrays of 1,000,000 Integers***");
		randomInts1 = randomIntArray(1000000);
		randomInts2 = randomInts1.clone();
		increasingInts = increasingArray(10000000);

	
		//System.out.println("Java's merge sort took " + randomInts1.sort() + " comparisons.");
		System.out.println("Our quick sort took " + testTime(randomInts2) + " comparisons.");
		System.out.println("Our quick sort with an increasing array took " + testTime(increasingInts) + " comparisons.");


	}

	private static <T extends Comparable<T>> long testTime(T[] arr ) {
		quickSort.comparisonCount = 0;
		quickSort.quickSort(arr);
		return quickSort.comparisonCount;
	}
	
	private static <T extends Comparable<T>> long javaSort(T[] arr ) {
		testInteger.javaCompares = 0;
		Arrays.sort(arr);
		return testInteger.javaCompares;
	}
	
	public static Integer[] randomIntArray(int arrayLength) {
		Random rand = new Random();
		Integer[] randomInts = new Integer[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			randomInts[i] = rand.nextInt();
		}
		return randomInts;
	}
	
	public static Integer[] increasingArray (int arrayLength) {
		
		Integer[] randomInts = new Integer[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			randomInts[i] = i; 
		}
		return randomInts;
	}
}
